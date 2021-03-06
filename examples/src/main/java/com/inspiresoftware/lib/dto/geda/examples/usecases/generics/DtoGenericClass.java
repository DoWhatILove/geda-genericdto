

/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.examples.usecases.generics;

import com.inspiresoftware.lib.dto.geda.adapter.DtoToEntityMatcher;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoCollection;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;
import com.inspiresoftware.lib.dto.geda.annotations.DtoMap;
import org.junit.Ignore;

import java.util.ArrayList;


/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.1.1
 * 
 * @param <V> simple value
 * @param <C> collection
 * @param <M> map
 *
 */
@Dto
@Ignore
public class DtoGenericClass<V, C, M> {

	/** Basic matcher. */
    public static class Matcher implements DtoToEntityMatcher<DtoGenericItemClass<String>, EntityGenericItemClass<String>> {
    	/** {@inheritDoc} */
    	public boolean match(final DtoGenericItemClass<String> testDto15Class, final EntityGenericItemClass<String> testEntity15Class) {
            return testDto15Class.getMyProp().equals(testEntity15Class.getMyProp());
        }
    }
	
	@DtoField("myProp")
	private V myProp;
	
	@DtoCollection(value = "myColl",
			   	   dtoBeanKey = "collItem",
			   	   entityBeanKeys = { "entityItem" },
			   	   dtoToEntityMatcher = Matcher.class,
			   	   entityGenericType = EntityGenericItemClass.class)
	private C myColl;

	@DtoMap(value = "myMap",
			dtoBeanKey = "colItem",
			entityBeanKeys = { "entityItem" },
			dtoToEntityMatcher = Matcher.class,
			entityGenericType = EntityGenericItemClass.class,
			entityMapOrCollectionClass = ArrayList.class,
			entityCollectionMapKey = "myProp")
	private M myMap;

	/**
	 * @return property
	 */
	public V getMyProp() {
		return myProp;
	}

	/**
	 * @param myProp property
	 */
	public void setMyProp(final V myProp) {
		this.myProp = myProp;
	}

	/**
	 * @return property
	 */
	public C getMyColl() {
		return myColl;
	}

	/**
	 * @param myColl property
	 */
	public void setMyColl(final C myColl) {
		this.myColl = myColl;
	}

	/**
	 * @return property
	 */
	public M getMyMap() {
		return myMap;
	}

	/**
	 * @param myMap property
	 */
	public void setMyMap(final M myMap) {
		this.myMap = myMap;
	}
	
}
