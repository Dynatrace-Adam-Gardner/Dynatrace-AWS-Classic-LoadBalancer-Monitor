package com.dynatrace.AWSClassicLoadBalancer.Constants;

public interface IConstants
{
	// Plugin input configuration variables
	public static final String ACCESS_KEY = "accessKey";
	public static final String SECRET_KEY = "secretKey";
	public static final String AWS_REGION = "awsRegion";
	public static final String LOAD_BALANCER_NAME = "loadBalancerName";
	public static final String DATA_GRANULARITY = "dataGranularity";
	public static final String MEASURE_GROUP_NAME = "Classic Load Balancer Metrics";
	
	// Aggregation
	public static final String AGGREGATION_MINIMUM = "Minimum";
	public static final String AGGREGATION_AVERAGE = "Average";
	public static final String AGGREGATION_MAXIMUM = "Maximum";
	public static final String AGGREGATION_SUM = "Sum";
	public static final String AGGREGATION_SAMPLE_COUNT = "SampleCount";
	
	// AWS constants
	public static final String AWS_NAMESPACE = "AWS/ELB";
	public static final String DIMENSION_NAME = "LoadBalancerName";
	
	/*
	 * Data Granularities
	 * Possible Values
	 * "1 Minute" | "5 Minutes" | "10 Minutes" | "15 Minutes" | "30 Minutes" | "1 Hour"
	 */
	public static final String DATA_GRANULARITY_1MIN = "1 Minute";
	public static final String DATA_GRANULARITY_5MINS = "5 Minutes";
	public static final String DATA_GRANULARITY_10MINS = "10 Minutes";
	public static final String DATA_GRANULARITY_15MINS = "15 Minutes";
	public static final String DATA_GRANULARITY_30MINS = "30 Minutes";
	public static final String DATA_GRANULARITY_1HOUR = "1 Hour";
}
