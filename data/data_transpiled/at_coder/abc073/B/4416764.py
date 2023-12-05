def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _scanner ( )
    def main ( self ) :
        n = len ( self.sc )
        ans = 0
        for i in range ( n ) :
            l , r = _scanner ( )
            ans += r - l + 1
        print ( ans )
