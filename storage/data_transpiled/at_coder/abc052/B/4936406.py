def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.output = 0
        x = 0
        self.sc = sys.stdin
        s = sys.stdin.read ( )
        for c in s :
            if c == 'I' :
                x += 1
                if self.output < x :
                    self.output = x
            else :
                self.x -= 1
        print ( self.output )
