Feature: Validating place Api

Scenario: Verify Place has been succseefully retrive the bookingId
Given Add place Payload with get
When User calls with http request
Then validate the points

@(priority=1)
Scenario: Verify Place has been succseefully post to created 
Given Add place Payload with body with post_ 
When User calls with http request with_post
Then validate the points with post

Scenario: Verify Place has been succseefully retrive the bookingId_1
Given Add place Payload with get_1
When User calls with http request_1
Then validate the points_1