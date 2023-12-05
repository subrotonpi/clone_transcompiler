def main ( ) :
    import os
    import sys
    from itertools import count
    class Main ( object ) :
        def __init__ ( self ) :
            self.FNAME = ''
            self.in_ = open ( FNAME + '.in' , 'r' )
            self.out = open ( FNAME + '.out' , 'w' )
        def close ( self ) :
            self.out.close ( )
        def happy ( x , b , gone , happy ) :
            if x < len ( gone ) and gone [ x ] :
                return happy [ x ]
            if x < len ( gone ) :
                gone [ x ] = True
            y = xc = x
            while x > 0 :
                t = x // b
                r = x - t * b
                y += r * r
                x = t
            h = happy ( y , b , gone , happy )
            if xc < len ( gone ) :
                happy [ xc ] = h
            return h
        def run ( self ) :
            tn = len ( self.in_ )
            self.in_ = [ ]
            self.err = [ ]
            self.gone = [ [ ] for _ in range ( 11 ) ]
            self.happy = [ [ ] for _ in range ( 11 ) ]
            for test in range ( 1 , tn ) :
                s = self.in_.split ( )
                n = len ( s )
                b = [ eval ( s [ i ] ) for i in range ( n ) ]
                for i in range ( 2 ) :
                    ok = True
                    for j in range ( n ) :
                        ok &= happy ( i , b [ j ] , gone [ b [ j ] ] , happy [ b [ j ] ] )
                    if ok :
                        self.out.write ( 'Case #%d: %d\n' % ( test , i ) )
                        self.out.flush ( )
                        break
                    if i & ( ( 1 << 20 ) - 1 ) == 0 :
                        self.out.flush ( )
                        break
    return Main ( )
