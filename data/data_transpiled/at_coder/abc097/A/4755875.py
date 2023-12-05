def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a , b , c , d = sc.__next__ ( )
            dif_ab = int ( abs ( a - b ) )
            dif_bc = int ( abs ( b - c ) )
            dif_ac = int ( abs ( a - c ) )
            if dif_ab <= d and dif_bc <= d :
                self.out.write ( "Yes" )
            elif dif_ac <= d :
                self.out.write ( "Yes" )
            else :
                self.out.write ( "No" )
