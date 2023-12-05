def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.next ( )
        ans = 0
        for c in N :
            if c == '+' :
                ans += 1
            else :
                ans -= 1
        print ( ans )
