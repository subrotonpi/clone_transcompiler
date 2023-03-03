def import import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.x = sc.x
    def main ( self ) :
        n = self.n
        x = sc.x
        ans = n
        a = n - x
        b = x
        while b != 0 :
            r , q = divmod ( a , b )
            ans += 2 * b * r
            if q == 0 :
                ans -= b
            a , b = b , q
        print ( ans )
