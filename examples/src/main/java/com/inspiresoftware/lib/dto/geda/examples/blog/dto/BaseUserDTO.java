/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.examples.blog.dto;

/**
 * .
 * <p/>
 * User: denispavlov
 * Date: Jul 1, 2012
 * Time: 1:10:20 PM
 */
public interface BaseUserDTO {

    Long getUserId();

    void setUserId(Long userId);

    String getUsername();

    void setUsername(String username);
    
}
