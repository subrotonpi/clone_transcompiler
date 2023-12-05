def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
        self.cnt = 1
        clash = 0
        for i in range ( self.N ) :
            if self.S [ i ] == '+' :
                self.cnt += 1
                if self.cnt > L :
                    clash += 1
                    self.cnt = 1
            elif self.S [ i ] == '-' :
                self.cnt -= 1
                if self.cnt == 0 :
                    self.cnt = 1
    print ( clash )
