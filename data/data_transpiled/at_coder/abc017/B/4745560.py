def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        self.ans = "YES"
        for i in range ( len ( self.s ) ) :
            if self.s [ i ] == "c" and self.s [ i + 1 ] == "h" :
                self.i += 2
            elif self.s [ i ] == "o" :
                self.i += 1
            elif self.s [ i ] == "k" :
                self.i += 1
            elif self.s [ i ] == "u" :
                self.i += 1
            else :
                self.ans = "NO"
                break
        print ( self.ans )
