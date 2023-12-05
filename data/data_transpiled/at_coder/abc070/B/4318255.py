def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        if self.a <= self.c :
            if self.d <= self.b :
                ans = self.d - self.c
            else :
                ans = self.b - self.c
        else :
            if self.d <= self.b :
                ans = self.d - self.a
            else :
                ans = self.b - self.a
        print ( max ( ans ) )
