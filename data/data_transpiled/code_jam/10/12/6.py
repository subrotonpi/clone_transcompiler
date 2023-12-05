def import import _scanner
class B ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for case in range ( 1 , T + 1 ) :
            super ( B , self ).__init__ ( )
    def __init__ ( self ) :
        self.D = int ( self.D )
        self.I = int ( self.I )
        self.M = int ( self.M )
        self.N = int ( self.N )
        a = [ ]
        def ok ( a , b ) :
            return abs ( a - b ) <= M
        def go ( self ) :
            for i in range ( self.N ) :
                a.append ( _scanner.scan ( self ) )
            old = [ ]
            for v in a :
                ny = [ ]
                for i in range ( 256 ) :
                    ny.append ( old [ i ] + D )
                for i in range ( 256 ) :
                    if ok ( i , v ) :
                        ny [ v ] = min ( ny [ v ] , old [ i ] )
                for i in range ( 256 ) :
                    for j in range ( 256 ) :
                        if ok ( i , j ) :
                            diff = abs ( i - v )
                            nyv = old [ j ] + diff
                            ny [ i ] = min ( ny [ i ] , nyv )
            old = ny
        ans = sum ( [ p for p in old ] )
        print ( "Case #%d: %d" % ( self.CASE , ans ) )
