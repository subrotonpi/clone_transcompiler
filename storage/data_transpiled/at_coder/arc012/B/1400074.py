def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        va = sc.eval ( )
        vb = sc.eval ( )
        L = sc.eval ( )
        ans = L
        for i in range ( N ) :
            ans = ( vb * ans ) / va
        print ( ans )
