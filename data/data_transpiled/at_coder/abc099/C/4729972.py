def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , tan
    from math import sin , cos , tan
    from math import sin , cos , tan , pi
    from math import pi
    from math import sin , cos , pi
    from math import sin , cos , pi
    n = int ( sys.argv [ 1 ] )
    dp = [ 0 ] * ( n + 10 )
    for i in range ( 1 , len ( dp ) ) :
        dp [ i ] = sum ( dp [ i ] )
        tmp = 1
        while tmp <= i :
            dp [ i ] = min ( dp [ i ] , dp [ i - tmp ] + 1 )
            tmp *= 6
        tmp = 1
        while tmp <= i :
            dp [ i ] = min ( dp [ i ] , dp [ i - tmp ] + 1 )
            tmp *= 9
    print ( dp [ n ] )
