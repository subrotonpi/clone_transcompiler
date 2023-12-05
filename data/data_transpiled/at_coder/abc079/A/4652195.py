def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = sys.stdin.read ( )
    def run ( self ) :
        self.cnt = 0
        pre = 0
        while self.N > 0 :
            if self.N % 10 == pre :
                self.cnt += 1
            else :
                self.cnt = 1
            if self.cnt == 3 :
                self.print ( "Yes" )
                return
            pre = self.N % 10
            self.N /= 10
        print ( "No" )
