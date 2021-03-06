
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.assembler.examples.parent;

import org.junit.Ignore;

/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Ignore
public interface TestEntity11ParentInterface {
	
	/**
	 * @return PK of this entity.
	 */
	long getEntityId();
	/**
	 * @param entityId PK of this entity.
	 */
	void setEntityId(final long entityId);
	/**
	 * @return name
	 */
	String getName();
	/**
	 * @param name name
	 */
	void setName(final String name);
	
}
