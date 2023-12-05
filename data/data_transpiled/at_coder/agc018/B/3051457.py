def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        m = sc.number
        a = [ [ ] for _ in range ( n ) ]
        min = n
        for i in range ( m ) :
            mnum = [ int ( a [ i ] [ 0 ] ) ]
            max , maxpos = 0 , 0
            for j in range ( m ) :
                if mnum [ j ] > max :
                    max , maxpos = mnum [ j ]
            if max < min :
                min = max
            for j in range ( n ) :
                a [ j ] -= max
