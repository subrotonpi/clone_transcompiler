def import _solve
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.x = x
        ret = solve ( self.n , self.x )
        print ( ret )
    def solve ( self , n , x ) :
        if n == 3 * x :
            return self.n
        if 2 * x > n :
            x = n - x
        y = self.n - x
        tmp = ( y // x ) * 3 * x
        tmp1 = ( self.x + y % x , self.x ) if self.y % x != 0 else 0
        return tmp + tmp1
