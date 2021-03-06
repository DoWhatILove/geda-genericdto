
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */


package com.inspiresoftware.lib.dto.geda.examples.usecases.simple;

import org.junit.Ignore;


/**
 * Test entity for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Ignore
public class SimpleEntityClass extends BaseSimpleEntityClass {
	
	private boolean decision;

	/**
	 * @return boolean value.
	 */
	public boolean getDecision() {
		return decision;
	}

	/**
	 * @param decision boolean value.
	 */
	public void setDecision(final boolean decision) {
		this.decision = decision;
	}
	
	

}
