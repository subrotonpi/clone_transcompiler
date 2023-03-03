def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.hs = set ( )
        self.ans = 0
        for i in range ( self.n ) :
            a = sys.stdin.readline ( ).strip ( )
            if a not in self.hs :
                self.ans += 1
                self.hs.add ( a )
        if self.ans & 1 == 0 :
            self.ans -= 1
        print ( self.ans )
