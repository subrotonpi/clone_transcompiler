def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.n = sc.n
        ans = 0
        ar = [ ]
        for i in range ( n ) :
            ar.append ( sc.randint ( 0 , 1 ) )
        color = 10000
        for i in range ( 1 , n ) :
            if ar [ i ] == ar [ i - 1 ] :
                ans += 1
                ar.append ( color )
                color -= 1
        print ( ans )
