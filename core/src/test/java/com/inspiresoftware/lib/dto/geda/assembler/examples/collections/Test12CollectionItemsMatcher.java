
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.assembler.examples.collections;


import com.inspiresoftware.lib.dto.geda.adapter.DtoToEntityMatcher;
import org.junit.Ignore;

/**
 * Test matches that matches the Strings.
 * <p/>
 * User: Denis Pavlov
 * Date: Jan 25, 2010
 * Time: 3:34:16 PM
 */
@Ignore
public class Test12CollectionItemsMatcher implements DtoToEntityMatcher<TestDto12CollectionItemIterface, TestEntity12CollectionItemInterface> {

	/** {@inheritDoc} */
    public boolean match(final TestDto12CollectionItemIterface dto, 
    		final TestEntity12CollectionItemInterface entity) {
        final String dtoName = dto.getName();
        final String entityName = entity.getName();

        return dtoName != null && entityName != null && dtoName.equals(entityName);
    }
}
