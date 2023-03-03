def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.eps = 1e-9
    def f ( self , a , b , c , x ) :
        return a * x + b * math.sin ( c * x * math.pi )
    def main ( self ) :
        sc = _sys.stdin
        a , b , c = map ( int , sc.split ( ) )
        left , right = 0.0 , 1000.0
        for i in range ( 100 ) :
            mid = ( left + right ) / 2
            if f ( self , a , b , c , mid ) - 100 > eps :
                right = mid
            else :
                left = mid
        print ( left )
