def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.read ( )
        self.key = self.N
        self.hairetu = [ self.N % self.N for self in range ( 10 ) ]
        self.sum = 0
        for i in range ( 10 ) :
            self.sum = self.sum + self.hairetu [ i ]
        if self.key % self.sum == 0 :
            self.print ( "Yes" )
        else :
            self.print ( "No" )
