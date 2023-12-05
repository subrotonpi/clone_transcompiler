def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( ).encode ( 'utf-8' )
    def main ( self ) :
        self.s = sys.stdin.read ( ).encode ( 'utf-8' )
        m = len ( self.s ) // 2
        if len ( self.s ) % 2 == 0 :
            for i in range ( m ) :
                if self.s [ m - 1 - i ] != self.s [ m ] or self.s [ m + i ] != self.s [ m ] :
                    print ( self.m + i )
                    return
        else :
            for i in range ( m + 1 ) :
                if self.s [ m - i ] != self.s [ m ] or self.s [ m + i ] != self.s [ m ] :
                    print ( self.m + i )
                    return
        print ( len ( self.s ) )
