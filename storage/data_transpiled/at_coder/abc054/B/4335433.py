def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n , m = sc.regs [ 0 ]
        a = [ sc.regs [ 1 ] ]
        b = [ sc.regs [ 2 ] ]
        for i in range ( n - m + 1 ) :
            ans = True
            for k in range ( m ) :
                for l in range ( m ) :
                    if a [ i + k ] [ j + l ] != b [ k ] [ l ] :
                        ans = False
            if ans :
                print ( "Yes" )
                return
        print ( "No" )
