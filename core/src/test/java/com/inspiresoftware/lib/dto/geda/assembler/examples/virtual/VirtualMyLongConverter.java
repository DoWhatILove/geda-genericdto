
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.assembler.examples.virtual;

import com.inspiresoftware.lib.dto.geda.adapter.BeanFactory;
import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;
import org.junit.Ignore;


/**
 * 
 * @author denispavlov
 *
 */
@Ignore
public class VirtualMyLongConverter implements ValueConverter {

	/** {@inheritDoc} */
	public Object convertToDto(final Object object, final BeanFactory beanFactory) {
		final TestEntity20Class entity = (TestEntity20Class) object;
		return entity.getPk();
	}

	/** {@inheritDoc} */
	public Object convertToEntity(final Object object, final Object oldEntity,
			final BeanFactory beanFactory) {
		final TestEntity20Class entity = (TestEntity20Class) oldEntity;
		if (object instanceof Long) {
			entity.setPk((Long) object);
		} else {
			entity.setPk(0L);
		}
		return entity;
	}

}
