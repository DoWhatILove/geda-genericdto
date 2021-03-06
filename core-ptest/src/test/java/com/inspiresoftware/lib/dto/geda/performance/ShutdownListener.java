
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.performance;

/**
 * Utility to shutdown executors
 * 
 * @author DPavlov
 */
public interface ShutdownListener {

	/**
	 * Add observable task that is run in the executors.
	 * @param object observable
	 */
	void addObservable(Object object);

	/**
	 * Send notification when observable had finished running.
	 * @param object observable
	 */
	void notifyFinished(Object object);
	
}
