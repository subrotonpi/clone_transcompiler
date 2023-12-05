def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def main ( self ) :
        n = self.n
        ans = 0
        for i in range ( n ) :
            l = _sys.maxint
            r = _sys.maxint
            ans += r - l + 1
        print ( ans )
