# Dynatrace-AWS-Classic-LoadBalancer-Monitor

Author: Adam Gardner (adam.gardner@dynatrace.com)

This Dynatrace AppMon plugin pulls metrics for the AWS Classic Load Balancer.

#### Available Metrics
Amazon provide guidance on which metrics and aggregation combinations are most useful (see [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/elb-metricscollected.html#load-balancer-metric-dimensions-clb)) and these are listed in bold below. These are the only metrics that have been tested during development of this plugin. However, others *should* work.

- _BackendConnectionErrors_ - **Sum** (Min, Avg, Max "not typically useful")
- _HealthyHostCount_ - **Average** and **Maximum**
- _HTTPCode_Backend_2XX_ - **Sum** (Min, Avg, Max "are all 1")
- _HTTPCode_Backend_3XX_ - **Sum** (Min, Avg, Max "are all 1")
- _HTTPCode_Backend_4XX_ - **Sum** (Min, Avg, Max "are all 1")
- _HTTPCode_Backend_5XX_ - **Sum** (Min, Avg, Max "are all 1")
- _HTTPCode_ELB_4XX_ - **Sum** (Min, Avg, Max "are all 1")
- _HTTPCode_ELB_5XX_ - **Sum** (Min, Avg, Max "are all 1")
- _Latency_ - Most useful statistic is **Average**. "Minimum is typically not useful".
- _RequestCount_ - **Sum** (Min, Avg, Max "are all 1")
- _SpilloverCount_ - **Sum** (Min, Avg, Max are not typically useful)
- _SurgeQueueLength_ - **Max**.  Average can be useful in combination with Minimum and Maximum to determine the range of queued requests. Sum is not useful.
- _UnHealthyHostCount_ - **Minimum** and **Average**

## Prerequisites
To use this plugin, you'll need the following details:

- **Access Key**: User must be in a group which has the *CloudWatchReadOnlyAccess* permission.
- **Secret Access Key**: Corresponding Secret Access key for the above.
- **AWS Region**: eg. *eu-west-2* defaults to *eu-west-2*
- **Load Balancer Name**: *classiclb1* in the screenshot below.

![Alt text](http://i63.tinypic.com/wrjdrt.png)

## Usage

1. Download the latest release from the Dynatrace Community.
2. Install the plugin via the client (or use the [REST interface](https://community.dynatrace.com/community/pages/viewpage.action?pageId=221381697) to automate).
3. Create a monitor and configure the monitor (the *host* setting is not used so setting this to localhost is acceptable).

### IMPORTANT: Supported Data Granularities

The **data granularity** and the plugin schedule time **MUST** match. In the following screenshots, both are set to 5 minutes.

#### Supported Data Granularities

- "1 Minute"
- "5 Minutes"
- "10 Minutes"
- "15 Minutes"
- "30 Minutes"
- "1 Hour"

    
![](http://i63.tinypic.com/2mhwqkw.png)

![](http://i68.tinypic.com/243ex4k.png)
