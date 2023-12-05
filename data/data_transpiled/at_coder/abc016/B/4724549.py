def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.plus = 0
        self.minus = 0
    def f1 ( self ) :
        self.f1 , self.f2 = False , False
        if self.A + self.B == self.C :
            self.f1 = True
        if self.A - self.B == self.C :
            self.f2 = True
        if self.f1 and not self.f2 :
            print ( '+' )
        elif self.f1 and not self.f2 :
            print ( '-' )
        elif self.f1 and self.f2 :
            print ( '?' )
        elif not self.f1 and not self.f2 :
            print ( '!' )
