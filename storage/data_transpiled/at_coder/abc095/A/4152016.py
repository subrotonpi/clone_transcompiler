def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        ans = 700
        for c in s :
            if c == 'o' :
                ans += 100
        print ( ans )
