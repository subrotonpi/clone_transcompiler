def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.count = 1
        if self.a == self.b and self.b == self.c and self.a == self.c :
            self.print ( self.count )
        elif self.a == self.b or self.b == self.c or self.a == self.c :
            self.count += 1
            self.print ( self.count )
        else :
            self.count = self.count + 2
            self.print ( self.count )
