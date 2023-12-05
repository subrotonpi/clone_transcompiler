def import import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def run ( self ) :
        sc = _sys.stdin
        N = sc.read ( )
        ans = 0
        for i in range ( N ) :
            l = sc.read ( )
            r = sc.read ( )
            ans += r - l + 1
        print ( ans )
