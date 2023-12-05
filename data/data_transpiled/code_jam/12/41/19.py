def _import ( ) :
    import sys
    import random
    from math import pow
    from math import sin , cos , sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , cos , sin , cos , sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , sin , cos , sin , cos , sin , , sin , , , ]
    from math import sin , cos , sqrt
    from random import random
    from os import urandom
    f = urandom ( 16 )
    T = int ( f.read ( ) )
    for cas in range ( 1 , T + 1 ) :
        n = random ( )
        D = [ sin ( a ) for a in range ( n + 2 ) ]
        L = [ sin ( a ) for a in range ( n + 2 ) ]
        P = [ cos ( a ) for a in range ( n + 2 ) ]
        D.append ( 0 )
        L.append ( 0 )
        for a in range ( n + 2 ) :
            D [ a ] = sin ( a )
            L.append ( sin ( a ) )
            P.append ( 1 )
        P [ a ] = 0
    print ( "Case #%d: %s\n" % ( cas , "NO" if P [