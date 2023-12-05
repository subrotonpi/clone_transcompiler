def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from math import ceil
    from math import sin , cos , log
    from math import log
    from math import sin , ceil , log
    from math import log
    from math import sin , cos , log
    from math import log
    from math import sin , ceil , log
    from math import log
    from math import sin , ceil , log
    from math import log
    N = int ( sys.argv [ 1 ] )
    Ma = int ( sys.argv [ 2 ] )
    Mb = int ( sys.argv [ 3 ] )
    a = [ int ( i ) for i in range ( N ) ]
    b = [ int ( i ) for i in range ( N ) ]
    c = [ int ( i ) for i in range ( N ) ]
    dp = [ [ 0 , 0 ] for i in range ( N + 1 ) ]
    ans = ceil ( sin ( dp [ 0 , 0 ] ) )
    for i in range ( N ) :
        for j in range ( 400 ) :
            for k in range ( 400 ) :
                dp [ i + 1 ] [ j + a [ i ] ] [ k + b [ i ] ] = min ( dp [ i + 1 ] [ j + a [ i ] ] [ k + b [ i ] ] , dp [ i ] [ j ] [ k ] + c [ i ] )
                dp [ i + 1 ] [ j ] [ k ] = min ( dp [ i + 1 ] [ j ] [ k ] , dp [ i ] [ j ] [ k ] )
    for j in range ( 1 , 400 ) :
        for k in range ( 1 , 400 ) :
            if k * Ma == j * Mb and dp [ N ] [ j ] [ k ] != 0 :
                ans = min ( ans , dp [ N ] [ j ] [ k ] )
    if ans == ceil ( sin ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( cos ( I * I