def main ( args ) :
    import sys
    from math import ceil
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    K = int ( sys.stdin.read ( ) )
    a = [ sin ( x ) for x in range ( K ) ]
    a = [ sin ( x ) for x in a ]
    max = 2
    min = 2
    for i in range ( K - 1 , - 1 , - 1 ) :
        min = ( ( min - 1 ) / a [ i ] + 1 ) * a [ i ]
        max = ( ( max ) / a [ i ] ) * a [ i ] + a [ i ] - 1
        if min > max :
            print ( - 1 )
            return
    print ( min , max )
