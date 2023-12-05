def main ( ) :
    import sys
    from math import ceil
    from math import sin
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import factorial
    from math import log
    num = int ( sys.stdin.readline ( ) )
    sum = [ 0 ] * ( num + 2 )
    sum [ 0 ] = 0
    for i in range ( 1 , num + 1 ) :
        sum [ i ] = sum [ i - 1 ] + log ( i )
    sum [ num + 1 ] = sum [ 0 ]
    sum [ num + 1 ] = sum [ 1 ]
    sum [ num + 1 ] = sum [ num + 1 ]
    ans = 0
    tmp = 1
    for i in range ( 0 , num ) :
        if sum [ i ] == sum [ i + 1 ] :
            tmp += 1
        else :
            ans += tmp * ( tmp - 1 ) / 2
            tmp = 1
    print ( ans )
