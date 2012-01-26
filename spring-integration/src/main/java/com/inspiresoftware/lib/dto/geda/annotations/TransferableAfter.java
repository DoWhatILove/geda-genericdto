/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package com.inspiresoftware.lib.dto.geda.annotations;

import java.lang.annotation.*;

/**
 * Annotation that allows to specify methods to be advised to trigger
 * automatic dto/entity assembly.
 *
 * There is only one rule to the signatures of the methods that are annotated:
 * The first parameters to the method must match one of the signatures in the
 * {@link com.inspiresoftware.lib.dto.geda.DTOSupport}
 *
 * After the method had been invoked this annotation will use result as target
 * of the conversion (either DTO or Entity depending on direction)
 *
 * E.g. signature:
 *                           @TransferableAfter(direction = ENTITY_TO_DTO)
 *        final Dto dtoOut = doTransfer(dtoIn, entity);
 *
 *      will result in:
 *
 *        final Dto dtoOut = support.assembleDto(dtoOut, entity)
 *
 * E.g. signature:
 *                                 @TransferableAfter(direction = DTO_TO_ENTITY)
 *        final Entity entityOut = doTransfer(dto, entityIn);
 *
 *      will result in:
 *
 *        final Entity entityOut = support.assembleEntity(dto, entityOut)
 *
 * <p/>
 * User: denispavlov
 * Date: Jan 25, 2012
 * Time: 7:50:53 PM
 */
@Target( { ElementType.METHOD } )
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TransferableAfter {

    /**
     * @return defines direction of transfer to perform on advised method.
     */
    Direction direction() default Direction.DTO_TO_ENTITY;

}