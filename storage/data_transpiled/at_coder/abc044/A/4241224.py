def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n , k , x , y = sc.__next__ ( )
        print ( min ( n , k ) * x + max ( n - k , 0 ) * y )
