def _import ( ) :
    import os
    import sys
    import os
    import sys
    class Digging ( object ) :
        class Position ( object ) :
            def __init__ ( self , x ) :
                self.cells = x
            def canFall ( self , r , c , f , d ) :
                for i in range ( self.cells ) :
                    if d [ r + 2 + i ] [ c ] == '#' :
                        return True
                return False
    def _main ( self , * args ) :
        fname = 'B-large'
        with open ( fname + '.in' , 'r' ) as sc :
            with open ( fname + '.out' , 'w' ) as f :
                n = sc.read ( )
                for i in range ( n ) :
                    r , c , f = sc.read ( )
    def _main ( self , * args ) :
        d = [ ]
        for j in range ( self.cells ) :
            d.append ( sc.read ( ) )
        b = [ ]
        d.append ( '#' )
        d.append ( ''.join ( b ) )
        s1 = [ ]
        s2 = [ ]
        M = 10000
        for j in range ( self.cells ) :
            [ m ] = s1 [ j ] [ m ]
        s1.append ( 0 )
        for j in range ( self.cells ) :
            for k in range ( self.cells ) :
                for l in range ( self.cells ) :
                    m = s1 [ k ] [ l ]
                    if m < M :
                        if d [ j + 1 ] [ k ] == '.' :
                            s2 [ k ] [ l ] = min ( s2 [ k ] [ l ] , m )
