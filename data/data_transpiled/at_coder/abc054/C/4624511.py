def import math
import math
import math
import math
import math
import math
import math
import math
import math
import math
import math
import math
import sys
ans = 0
def main ( ) :
    N = math.atoi ( 'N' )
    M = math.atoi ( 'M' )
    visited = [ ]
    bridges = [ ]
    for i in range ( M ) :
        from_i = math.atoi ( 'from' ) - 1
        to_i = math.atoi ( 'to' ) - 1
        bridges [ from_i ] = bridges [ to_i ] = True
    visited.append ( True )
    dfs ( N , 0 , bridges , visited )
    print ( ans )
def dfs ( N , from_i , bridges , visited ) :
    all_visit = True
    for i in range ( N ) :
        all_visit &= visited [ i ]
    if all_visit :
        ans += 1
        return
    for i in range ( N ) :
        if bridges [ from_i ] and not visited [ i ] :
            visited [ i ] = True
            dfs ( N , i , bridges , visited )
            visited [ i ] = False
