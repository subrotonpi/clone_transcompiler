def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
        self.crash_count = 0
        self.tab = 1
        for c in self.S :
            if c == '+' :
                self.tab += 1
            if c == '-' :
                if self.tab == 1 :
                    continue
                self.tab -= 1
            if self.tab > self.L :
                self.crash_count += 1
                self.tab = 1
        print ( self.crash_count )
