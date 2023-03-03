def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        self.n = sc.n
        self.mod30 = n % 30
        arr = [ i + 1 for i in range ( 6 ) ]
        for i in range ( self.mod30 ) :
            k = i % 5
            tmp = arr [ k ]
            arr [ k ] = arr [ k + 1 ]
            arr [ k + 1 ] = tmp
        for i in range ( len ( arr ) ) :
            print ( arr [ i ] , end = ' ' )
