# Dynatrace-AWS-Classic-LoadBalancer-Monitor

Author: Adam Gardner (adam.gardner@dynatrace.com)

This Dynatrace AppMon plugin pulls metrics for the AWS Classic Load Balancer.

Possible metrics are:

- BackendConnectionErrors - Sum (Min,Avg,Max "not typically useful")
- HealthyHostCount - Average and Maximum
- HTTPCode_Backend_2XX - Sum (Min, Avg, Max "are all 1")
- HTTPCode_Backend_3XX - Sum (Min, Avg, Max "are all 1")
- HTTPCode_Backend_4XX - Sum (Min, Avg, Max "are all 1")
- HTTPCode_Backend_5XX - Sum (Min, Avg, Max "are all 1")
- HTTPCode_ELB_4XX - Sum (Min, Avg, Max "are all 1")
- HTTPCode_ELB_5XX - Sum (Min, Avg, Max "are all 1")
- Latency - Most useful statistics are Average and pNN.NN (percentiles). "Minimum is typically not useful".
- RequestCount - Sum (Min, Avg, Max "are all 1")
- SpilloverCount - Sum (Min, Avg, Max are not typically useful)
- SurgeQueueLength - Max.  Average can be useful in combination with Minimum and Maximum to determine the range of queued requests. Sum is not useful.
- UnHealthyHostCount - Minimum and Average

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
