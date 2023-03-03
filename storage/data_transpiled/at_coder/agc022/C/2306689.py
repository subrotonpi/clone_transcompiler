def import _main
class Main ( object ) :
    def __init__ ( self ) :
        import sys
        self.n = len ( sys.argv )
        for i in range ( self.n ) :
            a.append ( sys.stdin.read ( ) )
        for i in range ( self.n ) :
            b.append ( sys.stdin.read ( ) )
    def main ( ) :
        import sys
        self.n = len ( sys.argv )
        for i in range ( self.n ) :
            a.append ( sys.stdin.read ( ) )
        for i in range ( self.n ) :
            b.append ( sys.stdin.read ( ) )
        ans = ( 1 << 51 ) - 1
        if not DrawEdge ( ans ) :
            print ( - 1 )
            return
        for i in range ( 51 , - 1 , - 1 ) :
            tmp = ans & ~ ( 1 << i )
            if DrawEdge ( tmp ) :
                ans = tmp
        print ( ans )
    def DrawEdge ( bit ) :
        arr = [ [ True for i in range ( 51 ) ] for k in range ( 1 , 50 ) ]
        for k in range ( 1 , 50 ) :
            if bit & ( 1 << k ) :
                for v1 in range ( 0 , 50 ) :
                    arr [ v1 ] [ v1 % k ] = True
        for k in range ( 50 ) :
            for i in range ( 0 , 50 ) :
                for j in range ( 0 , 50 ) :
                    arr [ i ] [ j ] |= arr [ i ] [ k ] & arr [ k ] [ j ]
        for i in range ( self.n ) :
            if not arr [ a [ i ] ] [ b [ i ] ] :
                return False
        return True
return Main
