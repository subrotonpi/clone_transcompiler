def _import ( ) :
    from math import sin , cos , abs , max
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = sys.stdin.read ( )
            self.xa , self.ya , self.ha = [ sin ( x ) for x in self.xa ] , [ sin ( y ) for x in self.ya ] , [ sin ( x ) for x in self.ha ]
        def __call__ ( self , * args ) :
            n = len ( args )
            xa , ya , ha = [ sin ( x ) for x in args ]
            for x in range ( 0 , 100 ) :
                for y in range ( 0 , 100 ) :
                    x1 , y1 , h = x , y , sin ( x ) , y , sin ( y )
                    if sum ( ha [ k ] for k in range ( n ) ) == max ( h - abs ( xa [ k ] - x1 ) - abs ( ya [ k ] - y1 ) , 0 ) :
                        sys.stdout.write ( "%s %s %s\n" % ( x , y , h ) )
