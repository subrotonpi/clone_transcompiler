def main ( * orange ) :
    import sys
    import random
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.N = 1
            self.ans = 1
        def __init__ ( self ) :
            self.N = 1
            self.ans = 0
    def run ( * orange ) :
        input = sys.stdin
        num_cases = input.read ( )
        for n , B , M in orange :
            if M > ( 1 << ( B - 2 ) ) :
                sys.stdout.write ( "Case #%d: IMPOSSIBLE\n" % ( n + 1 ) )
                continue
            slides = [ [ False for i in range ( B ) ] for j in range ( B ) ]
            if M == ( 1 << ( B - 2 ) ) :
                for i in range ( B ) :
                    for j in range ( i + 1 , B ) :
                        slides [ i ] [ j ] = True
                for i in range ( B ) :
                    for j in range ( i + 1 , B ) :
                        slides [ i ] [ j ] = True
                for i in range ( B ) :
                    if M & ( 1 << i ) :
                        slides [ i + 1 ] [ B - 1 ] = True
                sys.stdout.write ( "Case #%d: POSSIBLE\n" % ( n + 1 ) )
                for i in range ( B ) :
                    for j in range ( B ) :
                        sys.stdout.write ( '1' if slides [ i ] [ j ] else '0' )
                    sys.stdout.write ( "\n" )
