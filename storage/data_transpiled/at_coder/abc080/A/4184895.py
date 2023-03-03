def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.readline ( ).strip ( )
        self.A = sys.stdin.readline ( ).strip ( )
        self.B = sys.stdin.readline ( ).strip ( )
        self.plan1 = self.N * self.A
        self.plan2 = self.B
        if self.plan1 > self.plan2 :
            print ( self.plan2 )
        if self.plan1 <= self.plan2 :
            print ( self.plan1 )
