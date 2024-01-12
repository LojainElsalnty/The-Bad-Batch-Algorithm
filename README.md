# Description
-The Bad Batch is currently on the planet Tatooine. 


-To hide their tracks, they decided that they would only get fuel for their ship from their trusted allies on each planet they land on, enroute to Naboo. 


-In order to go from one planet to the next, they need to do one hyperspace teleport. The one hyperspace teleport requires one litre of fuel. 


-Upon landing on a planet, unfortunately, there is a malfunction in the engines of the ship that drains out all the fuel it has and they depend on the fuel that they can get from their trusted allies on that planet. 


-However, if they want to teleport from one planet to the other by skipping a planet in the middle of the route, they must keep in mind if the amount of fuel that they currently hold would be enough for the number of hyperspace teleports that would get them to that further planet. ie. they need to do the hyperspace teleports in the order of the planets but they don’t have to land and take the fuel from the trusted allies in the middle.


-May the Force be with them!

-The Bad Batch managed to broadcast a message to all their trusted allies on the planets asking them to inform the Bad Batch of the fuel litres they can provide when they land on their planets. Now that the Bad Batch knows the amount of fuel each planet can provide and how much they require for their journey, they need to design:


a) A Divide and Conquer algorithm that will tell them whether they can reach Naboo with the amount of fuel that their allies will provide.
Sample Input/Output


     fuel=[2,3,1,1,4]
     Output: true


     fuel=[3,2,1,0,4]
     Output: false



b) A Greedy algorithm that does the same thing and runs in O(n).
 Sample Input/Output


     fuel=[2,3,1,1,4]
     Output: true


     fuel=[3,2,1,0,4]
     Output: false
c) Design a Dynamic programming algorithm that outputs the minimum number of planets the Bad Batch needs to land on and fuel to reach Naboo. The algorithm should run in O(n2).
Sample Input/Output


     fuel=[2,3,1,1,4]
     Output DP: 2
     Output path: {0,1,4}


d) Reconsruct a path that leads to Naboo with that minimum number of landings. The algorithm should run in O(n2).

Sample Input/Output


     fuel=[2,3,1,1,4]
     Output DP: 2
     Output path: {0,1,4}
