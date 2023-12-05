def import sys
import os
import sys
import os
import sys
import sys
import os
import sys
import sys
import sys
import sys
import os
import sys
import itertools
import itertools
N = int ( sys.stdin.readline ( ) )
for case_num in range ( 1 , N + 1 ) :
    sys.stdin.readline ( )
    P = int ( sys.stdin.readline ( ) )
    Q = int ( sys.stdin.readline ( ) )
    sys.stdin.readline ( )
    to_release = [ 0 ] * ( Q + 2 )
    coins = [ [ 0 ] * ( Q + 2 ) ] * ( Q + 2 )
    to_release [ Q + 1 ] = P + 1
    for i in range ( 0 , Q ) :
        coins [ i ] [ i + 1 ] = 0
    for delta in range ( 2 , Q + 1 ) :
        for i in range ( 0 , Q + 1 - delta ) :
            min = sys.maxint
            for k in range ( i + 1 , i + delta ) :
                if coins [ i ] [ k ] + coins [ k ] [ i + delta ] < min :
                    min = coins [ i ] [ k ] + coins [ k ] [ i + delta ]
            coins [ i ] [ i + delta ] = min + to_release [ i + delta ] - to_release [ i ] - 2
    sys.stdout.write ( "Case #%d: %d\n" % ( case_num , coins [ 0 ] [ Q + 1 ] ) )
