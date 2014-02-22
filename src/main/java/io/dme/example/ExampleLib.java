package io.dme.example;

/**
 * @author dezider.mesko
 * 
 */
public class ExampleLib {

	public Integer add(Integer first, Integer second) {
		if (first == null || second == null) {
			return null;
		}
		return first + second;
	}

}
