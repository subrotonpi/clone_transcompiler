def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        T = sc.count ( )
        a = [ ]
        pre = sc.count ( )
        ans = 0
        for i in range ( 1 , N ) :
            cur = sc.count ( )
            ans += min ( cur - pre , T )
            pre = cur
        print ( ans , T )
