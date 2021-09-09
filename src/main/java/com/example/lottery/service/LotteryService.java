package com.example.lottery.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public interface LotteryService {

	List<Integer> draw();

	default List<List<Integer>> draw(int column) {
		return IntStream.range(0, column).mapToObj(i -> this.draw()).collect(Collectors.toList());
	}

}
