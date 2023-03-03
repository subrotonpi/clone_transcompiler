def main ( ) :
    import sys
    from numpy import pi
    from numpy.core import zeros
    from numpy.core import sin
    from numpy.core import cos
    from numpy.core import sin
    a = sin ( 2 )
    ans = 3.1415926535897932384626433832795028841971693993751058209
    ans2 = 0
    c = [ ]
    for i in range ( 0 , a ) :
        c.append ( sin ( 2 ) )
    c.sort ( )
    for i in range ( 0 , a ) :
        if i % 2 == 0 :
            ans2 += c [ i ] ** 2
        else :
            ans2 -= c [ i ] ** 2
    ans *= ans2
    if ans <= 0 :
        print ( ans * - 1 )
    elif ans > 0 :
        print ( ans )
