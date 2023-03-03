def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        k = sc.__next__ ( )
        x = sc.__next__ ( )
        y = sc.__next__ ( )
        if n - k > 0 :
            print ( k * x + ( n - k ) * y )
        else :
            print ( n * x )
