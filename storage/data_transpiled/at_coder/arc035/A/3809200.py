def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( ).split ( '' )
        for i in range ( len ( self.s ) ) :
            if self.s [ i ] == self.s [ - i - 1 ] or self.s [ i ] == '*' or self.s [ - i - 1 ] == '*' : continue
            print ( 'NO' )
            return
        print ( 'YES' )
