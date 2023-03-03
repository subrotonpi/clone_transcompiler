def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.count = 0
        for c in self.s :
            if c == 'o' :
                self.count += 1
        print ( 700 + self.count * 100 )
