def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.s = sys.stdin.read ( )
        for i in range ( 1 , len ( self.s ) ) :
            if self.check ( self.s [ : - i ] ) :
                self.print ( self.s [ - i ] )
                return
    def check ( self , s ) :
        if len ( s ) % 2 != 0 :
            return False
        for i in range ( len ( s ) / 2 ) :
            if s [ i ] != s [ i + len ( s ) / 2 ] :
                return False
        return True
