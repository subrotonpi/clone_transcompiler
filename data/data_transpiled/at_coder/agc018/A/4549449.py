def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import gcd
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import gcd
    from math import log
    n = int ( sys.stdin.readline ( ) )
    k = int ( sys.stdin.readline ( ) )
    max = last = 0
    for i in range ( n ) :
        a = log ( i )
        if max < a :
            max = a
        if i == 0 :
            last = a
        else :
            last = gcd ( last , a )
    if k <= max and k % last == 0 :
        print ( "POSSIBLE" )
    else :
        print ( "IMPOSSIBLE" )
    def gcd ( x , y ) :
        if x % y == 0 :
            return y
        else :
            return gcd ( y , x % y )
    return gcd ( n , k )
