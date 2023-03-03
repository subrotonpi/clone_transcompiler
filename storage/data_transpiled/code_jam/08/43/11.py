def _import ( ) :
    from numpy import loadtxt
    from os import urandom
    from random import random
    class C ( object ) :
        def __init__ ( self ) :
            self.stdin = urandom ( 32 )
            self.stdout = sys.stderr = open ( 'w' , 'wt' )
            self.n = len ( self.stdin )
            for i in range ( n ) :
                self.stdout.write ( 'Case #%d: %s\n' % ( i + 1 , C ( ).solve ( ) ) )
    def solve ( ) :
        n = len ( self.stdin )
        c = [ [ ] for i in range ( 3 ) ]
        p = [ [ ] for i in range ( n ) ]
        l = r = 1e100
        while r > l + 1e-9 :
            m = ( l + r ) / 2
            q = [ 1e100 ] * n
            for i in range ( n ) :
                for j in range ( 8 ) :
                    qq = m * p [ i ]
                    for k in range ( 3 ) :
                        if ( j & ( 1 << k ) ) :
                            qq += c [ k ] [ i ]
                        else :
                            qq -= c [ k ] [ i ]
                    q [ j ] = min ( q [ j ] , qq )
            b = True
            for i in range ( 8 ) :
                if q [ i ] < - q [ i ^ 7 ] :
                    b = False
            if b :
                r = m
            else :
                l = m
        return '%s' % r
