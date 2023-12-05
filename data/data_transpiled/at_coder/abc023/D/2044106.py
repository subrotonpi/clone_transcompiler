def import _solve
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.h , self.s = [ int ( x ) for x in _solve ( self ) ]
    def solve ( self ) :
        low = 0
        high = float ( 2e14 ) [ 0 ]
        while high - low > 1 :
            mid = ( low + high ) / 2
            if self.check ( mid ) :
                high = mid
            else :
                low = mid
        return high
    def check ( x ) :
        time = [ 0 ] * n
        for i in range ( n ) :
            if x < self.h [ i ] :
                return False
            time [ int ( min ( n - 1 , ( x - self.h [ i ] ) / self.s [ i ] ) ) ] += 1
        for i in range ( n - 1 , 1 , - 1 ) :
            if time [ i ] < self.n - i :
                return False
            time [ i - 1 ] += time [ i ]
        return True
return Main
