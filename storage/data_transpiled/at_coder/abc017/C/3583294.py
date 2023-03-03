def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.l = [ ]
        self.r = [ ]
        self.s = [ ]
        self.point = [ ]
        self.sum = 0
        for i in range ( self.N ) :
            self.l.append ( self.N - 1 )
            self.r.append ( self.N - 1 )
            self.s.append ( self.N )
            self.sum += self.s [ i ]
            self.point [ self.l [ i ] ] += self.s [ i ]
            if self.r [ i ] != self.M - 1 :
                self.point [ self.r [ i ] + 1 ] -= self.s [ i ]
        self.min = sys.maxint
        self.temp = 0
        for i in range ( self.M ) :
            self.temp += self.point [ i ]
            self.min = min ( self.min , self.temp )
        print ( self.sum - self.min )
