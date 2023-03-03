def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        sum = 0
        max = 0
        for i in range ( N ) :
            a = _main ( )
            max = max ( max , a )
            sum += a
        sum -= max / 2
        print ( sum )
