def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.s = sc.scanner ( )
    def main ( self ) :
        s = self.s
        ans = 0
        for c in s :
            if c == '+' :
                ans += 1
            else :
                ans -= 1
        print ( ans )
