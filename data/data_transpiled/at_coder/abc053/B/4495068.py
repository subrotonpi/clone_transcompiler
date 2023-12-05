def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.num = len ( self.s )
        min = 10
        max = 0
        for i in range ( num ) :
            if self.s [ i ] == 'A' :
                min = i
                break
        for i in range ( num ) :
            if self.s [ i ] == 'Z' :
                max = i
        sys.stdout.write ( max - min + 1 )
