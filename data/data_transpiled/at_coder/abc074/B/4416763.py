def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.n , self.k = sc.next ( )
        ans = 0
        for i in range ( self.n ) :
            x = sc.next ( )
            ans += min ( abs ( k - x ) , x ) * 2
        print ( ans )
