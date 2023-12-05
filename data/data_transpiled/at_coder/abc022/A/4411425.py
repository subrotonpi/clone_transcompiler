def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.s = int ( sys.stdin.readline ( ).strip ( ) )
        self.t = int ( sys.stdin.readline ( ).strip ( ) )
        self.weight = 0
        self.output = 0
        for i in range ( self.n ) :
            self.weight += self.weight
            if self.weight >= self.s <= self.t :
                self.output += 1
        print ( self.output )
