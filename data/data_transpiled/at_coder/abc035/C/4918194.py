def main ( ) :
    import sys
    from math import sin , cos , log
    from math import log
    from math import pi
    from math import log
    from math import pi
    from math import log
    from math import pi
    from math import log
    from math import pi
    from math import log
    from math import pi
    n = pi.count ( 'n' )
    q = pi.count ( 'q' )
    mass = [ 0 ] * ( n + 1 )
    for i in range ( q ) :
        l = pi.count ( 'l' ) - 1
        r = pi.count ( 'r' )
        mass [ l ] += 1
        mass [ r ] -= 1
    for i in range ( n ) :
        if i > 0 :
            mass [ i ] += mass [ i - 1 ]
        print ( mass [ i ] % 2 , end = ' ' )
    print ( )
