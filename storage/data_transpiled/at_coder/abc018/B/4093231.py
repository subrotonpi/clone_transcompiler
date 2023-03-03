def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = len ( self.s )
        for i in range ( n ) :
            left = self.s [ left - 1 ]
            right = self.s [ right - 1 ]
            part = self.s [ left - 1 : right ]
            part.reverse ( )
            for i in range ( len ( part ) ) :
                self.s [ left - 1 + i ] = part [ i ]
        print ( self.s )
