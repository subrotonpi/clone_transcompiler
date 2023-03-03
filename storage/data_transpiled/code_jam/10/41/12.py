def test_import ( ) :
    from genomicode import Scanner , File
    class Main ( Scanner ) :
        def __init__ ( self ) :
            Scanner ( ).__init__ ( self )
            self.in_ = [ ]
            self.out = [ ]
        def close ( self ) :
            self.out.append ( "close" )
        def check ( self , f , msg ) :
            if not f :
                self.out.append ( "close" )
                raise RuntimeError ( msg )
        def run ( self ) :
            tn = len ( self.in_ )
            for test in range ( 1 , tn + 1 ) :
                k = len ( self.in_ )
                size = 2 * k - 1
                d = [ ]
                for i in range ( size ) :
                    c = [ i - '0' for j in range ( size ) ]
                    for j in range ( c ) :
                        d [ i ].append ( [ ' ' - '0' for j in range ( size ) ] )
                bx = by = 0
                for c in range ( size ) :
                    sx = 1
                    sy = 1
                    for i in range ( size ) :
                        i1 = 2 * c - i
                        if i1 < 0 or i1 >= size :
                            continue
                        for j in range ( size ) :
                            if d [ i ] [ j ] in [ ' ' , ' ' ] :
                                sx &= d [ i ] [ j ] == d [ i1 ] [ j ]
                            if d [ j ] in [ ' ' , ' ' ] :
                                sy &= d [ j ] [ i ] == d [ i1 ] [ j ]
                if sx and abs ( k - 1 - c ) < abs ( k - 1 - bx ) :
                    bx = c
                if sy and abs ( k - 1 - c ) < abs ( k - 1 - by ) :
                    by = c
            now = k * k
            self.out.append ( "Case #%d: %d" % ( test , then - now ) )
