def _import ( ) : return int ( next ( sys.stdin ) )
class GCJB ( object ) :
    def solve_g ( self , p ) : return long ( next ( sys.stdin ) )
    def solve_c ( self , n , p ) : return float ( next ( sys.stdin ) )
    def solve_g ( self , p ) : return long ( next ( sys.stdin ) )
    def solve_c ( self , n , p ) : return long ( next ( sys.stdin ) )
    def solve_g ( self , p ) : return float ( next ( sys.stdin ) )
    def solve_c ( self , n , p ) : return long ( next ( sys.stdin ) )
    def solve_c ( self , p ) : return float ( next ( sys.stdin ) )
    def solve ( self , f ) :
        n = int ( next ( sys.stdin ) )
        p = int ( next ( sys.stdin ) )
        ansg = solve_g ( self , n , p )
        ansc = solve_c ( self , n , p )
        if ansg < 0 or ansg >= 1 << n or ansc < 0 or ansc >= 1 << n or ansg > ansc :
            raise AssertionError ( n , ansg , ansc )
        f.write ( ansg + " " + ansc )
    def main ( self ) :
        f = sys.stdout
        f = Input ( file = f )
        tests = len ( f.readlines ( ) )
        for i in range ( tests ) :
            f.write ( "Case #%d: " % ( i + 1 ) )
            solve ( f , f )
            f.flush ( )
        f.close ( )
