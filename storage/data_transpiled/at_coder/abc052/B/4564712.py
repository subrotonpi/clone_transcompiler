def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.s = sys.stdin.read ( )
    def run ( self ) :
        self.ans = 0
        cnt = 0
        for c in self.s :
            if c == 'I' :
                cnt += 1
                if self.ans < cnt :
                    self.ans = cnt
            else :
                cnt -= 1
        print ( self.ans )
        self.ans = cnt
