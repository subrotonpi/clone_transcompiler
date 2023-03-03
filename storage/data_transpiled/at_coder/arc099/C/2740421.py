def _import ( ) : return sys.stdin
import builtins
import builtins
import builtins
import builtins
import time
import sys
INPUT = ''
mod = 1_000_000_007
inf = int ( sys.maxint )
def solve ( ) :
    n = ni ( )
    m = ni ( )
    exist = [ ]
    for i in range ( m ) :
        b = skip ( )
        yield b
    for i in range ( n ) :
        f = ni ( ) - 1
        t = ni ( ) - 1
        exist [ f ] = True
        exist [ t ] = True
    edge = [ ]
    for i in range ( n ) :
        edge.append ( [ ] )
    for i in range ( n ) :
        map = [ ns ( ) ]
        for i in range ( n ) :
            if i == j or exist [ i ] :
                continue
            edge [ i ].append ( j )
    seen = [ ]
    c = [ ]
    num = [ ]
    for i in range ( n ) :
        if not ( b >= '0' and b <= '9' ) :
            num = num * 10 + ( b - '0' )
        else :
            return - num
    for i in range ( n ) :
        a = [ ]
        for i in range ( n ) :
            if i == j or exist [ i ] :
                continue
            edge [ i ].append ( i )
    for i in range ( n ) :
        num.append ( 0 )
    for i in range ( n ) :
        if not edge [ i ] :
            q = [ ]
            q.append ( [ i , 0 ] )
    for i in range ( n ) :
        for j in range ( n ) :
            if not ( b >= '0' and b <= '9' ) :
                num.append ( j )
            else :
                num.append ( j )
    for i in range ( n ) :
        if not ( b == j or not seen [ i ] ) :
            seen [ i ] = False
            break
    ans = sum ( ans )
    return ans
