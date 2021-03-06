package com.awssamples.iam.policies;

import software.amazon.awscdk.services.iam.Effect;
import software.amazon.awscdk.services.iam.PolicyStatement;
import software.amazon.awscdk.services.iam.PolicyStatementProps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloudWatchEventsPolicies {
    private static final List<String> MINIMAL_LOGGING_ACTIONS = Arrays.asList("logs:CreateLogGroup", "logs:CreateLogStream", "logs:PutLogEvents", "logs:DescribeLogStreams");
    private static final List<String> ALL_LOG_GROUPS_AND_LOG_STREAMS = Collections.singletonList("arn:aws:logs:*:*:*");

    public static PolicyStatement getMinimalCloudWatchEventsLoggingPolicy() {
        PolicyStatementProps cloudWatchPolicyStatementProps = PolicyStatementProps.builder()
                .effect(Effect.ALLOW)
                .resources(ALL_LOG_GROUPS_AND_LOG_STREAMS)
                .actions(MINIMAL_LOGGING_ACTIONS)
                .build();

        return new PolicyStatement(cloudWatchPolicyStatementProps);
    }
}
