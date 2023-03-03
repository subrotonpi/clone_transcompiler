def main ( ) :
    import re
    import sys
    import json
    import json
    import defaultdict
    import random
    N = random.randint ( 1 , M )
    d = defaultdict ( lambda : [ ] )
    for i in range ( N ) :
        cost , num = random.randint ( 1 , M )
        d.compute ( cost , ( k , v ) if v is None else num + v )
    sys.stdout.flush ( )
    totalcost = 0
    bought = 0
    for kv , cost in d.items ( ) :
        maxnum = kv
        buycount = min ( maxnum , M - bought )
        totalcost += buycount * cost
        bought += buycount
        if bought > M :
            break
    print ( totalcost )
