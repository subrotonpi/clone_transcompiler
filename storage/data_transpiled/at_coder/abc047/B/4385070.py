def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.w = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
        self.s = [ ]
        self.left = self.right = self.w
        self.bottom = self.top = self.h
        for i in range ( self.n ) :
            x = self.s [ i ]
            y = self.s [ i ]
            a = self.s [ i ]
            if a == 1 :
                if self.left < x :
                    left = x
            elif a == 2 :
                if self.right > x :
                    right = x
            elif a == 3 :
                if self.bottom < y :
                    bottom = y
            elif a == 4 :
                if self.top > y :
                    top = y
        if self.right > left and self.top > bottom :
            print ( ( self.right - left ) * ( self.top - bottom ) )
        else :
            print ( 0 )
