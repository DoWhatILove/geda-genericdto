
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

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;
import com.inspiresoftware.lib.dto.geda.annotations.DtoParent;
import org.junit.Ignore;


/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Dto
@Ignore
public class TestDto11ChildClass implements TestDto11ChildInterface {
	
	@DtoParent
	@DtoField(value = "parent",
			  dtoBeanKey = "com.inspiresoftware.lib.dto.geda.assembler.TestDto11ParentClass",
			  entityBeanKeys = { "com.inspiresoftware.lib.dto.geda.assembler.TestEntity11ParentClass" })
	private TestDto11ParentInterface parent;
	
	@DtoField
	private String name;
	
	/**
	 * @return parent entity.
	 */
	public TestDto11ParentInterface getParent() {
		return parent;
	}
	/**
	 * @param parent parent entity.
	 */
	public void setParent(final TestDto11ParentInterface parent) {
		this.parent = parent;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name name
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
}
