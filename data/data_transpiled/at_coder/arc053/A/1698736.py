def import solve
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.f = sys.stdin
        self.f = sys.stdin
        self.f = sys.stdin
        self.h , self.w = self.f.read ( ).split ( '\n' )
        if self.h * self.w == 1 :
            self.f.write ( 0 )
            return
        if self.h == 1 :
            self.f.write ( self.w - 1 )
            return
        if self.w == 1 :
            self.f.write ( self.h - 1 )
            return
        print ( ( ( self.h - 1 ) * self.w + self.h * ( self.w - 1 ) ) )
    def solve ( self ) :
        self.f = sys.stdin
        return solve ( self )
