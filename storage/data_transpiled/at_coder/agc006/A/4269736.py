def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        L = sc.__next__ ( )
        R = sc.__next__ ( )
        for i in range ( n ) :
            if L [ i ] == R [ : n - i ] :
                print ( n + i )
                return
        print ( 2 * n )
