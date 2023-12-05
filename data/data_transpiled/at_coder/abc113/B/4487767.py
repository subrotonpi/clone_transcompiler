def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        T = sc.count ( )
        A = sc.count ( )
        index = 0
        min = sys.maxint
        for i in range ( N ) :
            h = sc.count ( )
            t = T - h * 0.006d
            if abs ( A - t ) < min :
                index = i
                min = abs ( A - t )
        print ( index + 1 )
