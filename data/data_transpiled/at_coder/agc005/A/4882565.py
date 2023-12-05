def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , x ) :
        self.scnt = 0
        self.setcnt = 0
        for c in x :
            if c == 'S' :
                self.scnt += 1
            elif self.scnt > 0 :
                self.setcnt += 1
                self.scnt -= 1
        print ( len ( self.scnt ) - ( self.setcnt * 2 ) )
