def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import gcd
    N = randint ( 1 , 100100 )
    A = [ ]
    for i in range ( N ) :
        A.append ( log ( i ) )
    res = A [ 0 ]
    for i in range ( N ) :
        res = gcd ( res , A [ i ] )
    print ( res )
    def gcd ( x , y ) :
        if y :
            return gcd ( y , x % y )
        return x
    return gcd ( A , gcd ( A , x ) )
