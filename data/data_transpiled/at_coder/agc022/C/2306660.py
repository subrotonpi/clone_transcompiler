def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 50
        self.A = [ ]
        self.B = [ ]
        def fun ( bit ) :
            arr = [ [ True for i in range ( 51 ) ] for j in range ( 1 , 50 ) ]
            for i in range ( 0 , 51 ) :
                if bit & ( 1 << i ) :
                    for j in range ( 0 , 50 ) :
                        arr [ j ] [ j % i ] = True
            for k in range ( 0 , 50 ) :
                for i in range ( 0 , 50 ) :
                    for j in range ( 0 , 50 ) :
                        arr [ i ] [ j ] |= arr [ i ] [ k ] & arr [ k ] [ j ]
            flag = True
            for i in range ( self.n ) :
                if not arr [ self.A [ i ] ] [ self.B [ i ] ] : flag = False
            return flag
        def solve ( self ) :
            with _main ( ) :
                self.n = self.n
                for i in range ( self.n ) :
                    self.A [ i ] = _main ( )
                for i in range ( self.n ) :
                    self.B [ i ] = _main ( )
    def solve ( self ) :
        with _main ( ) :
            self.n = self.n
            for i in range ( self.n ) :
                self.A [ i ] = _main ( )
            for i in range ( self.n ) :
                self.B [ i ] = _main ( )
        ans = ( 1 << 51 ) - 1
        if not fun ( ans ) :
            print ( - 1 )
            return
        for i in range ( 51 , - 1 , - 1 ) :
            tmp = ans & ~ ( 1 << i )
            if fun ( tmp ) :
                ans = tmp
        print ( ans )
return Main
