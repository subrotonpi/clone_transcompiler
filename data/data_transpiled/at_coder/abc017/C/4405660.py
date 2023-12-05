def main ( ) :
    import sys
    from math import sin , cos , pow
    from math import log
    from math import ceil
    from math import log
    from math import log
    from math import log
    from math import sin , cos , pow
    N = int ( sys.stdin.read ( ) )
    M = int ( sys.stdin.read ( ) )
    map = [ 0 ] * ( M + 1 )
    point_sum = 0
    for l , r , point in zip ( range ( N ) , range ( M ) ) :
        point_sum += point
        map [ l - 1 ] += point
        map [ r ] += - point
    min = sum ( map )
    now = 0
    for i in range ( M ) :
        now += map [ i ]
        min = min ( now , min )
    print ( point_sum - min )
