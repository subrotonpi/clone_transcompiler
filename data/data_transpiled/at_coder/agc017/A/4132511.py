def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from math import log
    from math import log
    from math import pi
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    p = int ( sys.stdin.read ( ) )
    arr_EV = [ 1 ]
    arr_OD = [ 0 ]
    arr_EV.append ( 0 )
    arr_OD.append ( 0 )
    for i in range ( 1 , n + 1 ) :
        a = int ( sys.stdin.read ( ) )
        arr_EV [ i ] , arr_OD [ i ] = arr_EV [ i - 1 ] , arr_OD [ i - 1 ]
        if a % 2 == 0 :
            arr_EV [ i ] += arr_EV [ i - 1 ]
            arr_OD [ i ] += arr_OD [ i - 1 ]
        else :
            arr_EV [ i ] += arr_OD [ i - 1 ]
            arr_OD [ i ] += arr_EV [ i - 1 ]
    if p == 0 :
        print ( arr_EV [ n ] )
    else :
        print ( arr_OD [ n ] )
