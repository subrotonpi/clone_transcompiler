def _ _ main _ _ ( ) : return True
class Main ( object ) :
    def __init__ ( self ) :
        self._not_my_scanner = None
    def solve ( ) :
        b = raw_input ( )
        m = raw_input ( )
        if 1 << ( b - 2 ) < m :
            self._not_my_scanner.write ( "IMPOSSIBLE" )
            return
        self._not_my_scanner.write ( "POSSIBLE" )
        g = [ [ ] for _ in range ( n ) ]
        g [ 0 ] [ b - 1 ] = True
        m -= 1
        for i in range ( 1 , b ) :
            for j in range ( i + 1 , b ) :
                g [ i ] [ j ] = True
        for p in range ( b - 3 , - 1 , - 1 ) :
            if ( ( m >> p ) & 1 ) != 0 :
                g [ 0 ] [ b - 2 - p ] = True
        for i in range ( b ) :
            for j in range ( b ) :
                self._not_my_scanner.write ( '1' if g [ i ] [ j ] else '0' )
        self._not_my_scanner.write ( "\n" )
    def run ( self ) :
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
        self._not_my_scanner = None
    def read ( self ) :
        return self._not_my_scanner
    def read ( self ) :
        return self._not_my_scanner
    def write ( self , read ) :
        return self._not_my_scanner
