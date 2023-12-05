def main ( ) :
    import sys
    from math import gcd
    from math import sqrt
    from math import gcd
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = log.find ( 'n' )
    x = [ ]
    for i in range ( 0 , n + 1 ) :
        x.append ( log.find ( 'n' ) )
    log.debug ( 'x = ' + str ( x [ 1 ] - x [ 0 ] ) )
    ans = sqrt ( x [ 1 ] - x [ 0 ] )
    for i in range ( 1 , n ) :
        d = pow ( x [ i + 1 ] - x [ i ] , x [ i ] )
        ans = ans.gcd ( d )
    print ( str ( ans ) )
