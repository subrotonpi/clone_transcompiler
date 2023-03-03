def import import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.s = sys.stdin
        self.n , self.k , self.b , c , r = self.s.n , self.k , self.b , self.c , self.r = 0 , 0 , 0 , 0
        for i in range ( self.n ) :
            if self.b < ( b , c ) :
                self.c += 1
            else :
                self.r += c - k + 1 if c >= k else 0
                c = 1
        print ( self.c >= k , r + c - k + 1 if c >= k else r )
