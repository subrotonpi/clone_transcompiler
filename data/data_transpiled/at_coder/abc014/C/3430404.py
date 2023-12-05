def main ( args ) :
    import time
    from math import ceil
    from math import sin , cos , pi
    from math import sin , cos , pi
    from math import sin , pi , pi , pi
    from os.path import join
    from os import urandom
    n = int ( sys.argv [ 1 ] )
    a = [ 0 for i in range ( 1000001 ) ]
    shita = [ pi for i in range ( n ) ]
    ue = [ pi for i in range ( n ) ]
    m = 0
    for i in range ( 1000001 ) :
        a.append ( 0 )
    for i in range ( n ) :
        shita.append ( pi )
        ue.append ( pi )
        a [ shita [ i ] ] += 1
        if ue [ i ] != 1000000 :
            a [ ue [ i ] + 1 ] -= 1
    for i in range ( 1000001 ) :
        if i > 0 :
            a [ i ] += a [ i - 1 ]
        if a [ i ] > m :
            m = a [ i ]
    print ( m )
    os.chdir ( '..' )
    def gcd ( a , b ) :
        if a < b :
            tmp = a
            a = b
            b = tmp
        r = - 1
        while r != 0 :
            r = a % b
            a = b
            b = r
        return a
    return gcd
