package com.desafioItau.demo.dto;

import java.util.DoubleSummaryStatistics;

public class EstatisticaResponse {
	private double max;
	private double min;
	private double avg;
	private double sum;
	private Long count;
	
	public EstatisticaResponse(DoubleSummaryStatistics doubleSummaryStatistics) {
		this.count = doubleSummaryStatistics.getCount();
		this.sum = doubleSummaryStatistics.getSum();
		this.max = (count == 0)? 0.0 : doubleSummaryStatistics.getMax();
		this.min = (count == 0)? 0.0 : doubleSummaryStatistics.getMin();;
		this.avg = doubleSummaryStatistics.getAverage();
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
}
