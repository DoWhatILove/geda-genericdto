
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package com.inspiresoftware.lib.dto.geda.examples.usecases.maps;

import org.junit.Ignore;

import java.util.Map;


/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Ignore
public class EntityMapClass implements EntityMapInterface {
	
	private Map<String, EntityItemInterface> items;

	/** {@inheritDoc} */
	public Map<String, EntityItemInterface> getItems() {
		return items;
	}

	/** {@inheritDoc} */
	public void setItems(final Map<String, EntityItemInterface> items) {
		this.items = items;
	}
	
}