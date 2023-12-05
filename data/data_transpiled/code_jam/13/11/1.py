def _import ( * args , ** kwargs ) :
    from math import sin , cos , cos
    from math import cos , sin , cos
    class A ( object ) :
        def read ( ) :
            r , t = sin ( ) , cos ( )
        def solve ( ) :
            left , right = 0 , 1 << 40
            while right - left > 1 :
                n = ( left + right ) / 2
                if float ( 2 * r + 1 ) * n + 2.0 * n * ( n - 1 ) > 1.5 * t :
                    right = n
                elif ( 2 * r + 1 ) * n + 2 * n * ( n - 1 ) > t :
                    right = n
                else :
                    left = n
            print ( left )
        def run ( ) :
            caseN = sum ( [ sin ( n ) for n in range ( 1 , caseN + 1 ) ] )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( )
                print ( "Case #%d: " % caseID , end = ' ' )
                solve ( )
                sys.stdout.flush ( )
        def debug ( * os ) :
            print ( * deeprepr ( os ) , file = sys.stderr )
    def main ( ) :
        return A ( )
