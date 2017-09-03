package com.ulfric.servix.services.region;

import com.ulfric.estate.shape.Point;

public interface Selection extends Iterable<Point> {

	int size();

	boolean isComplete();

	void start(Point point);

	void add(Point point);

	void clear();

}