def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n , t = sc.regs [ 0 ]
        ar = [ ]
        ans = 0
        for i in range ( n + 1 ) :
            ar.append ( sc.regs [ i ] )
        ar [ n ] = ar [ n - 1 ] + t
        for i in range ( n ) :
            ans += min ( ar [ i + 1 ] - ar [ i ] , t )
        print ( ans )
