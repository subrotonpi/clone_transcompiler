def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.c = self.s.split ( ' ' )
        self.l = 100001
        self.r = [ [ 0 for i in range ( self.c + 1 ) ] for f , t , d in self.s.split ( ' ' ) ]
        self.r [ d ] [ f ] += 1
        self.r [ d ] [ t ] -= 1
    for i in range ( 1 , self.c + 1 ) :
        self.r [ 0 ] [ 0 ] += self.r [ i ] [ 0 ]
        for j in range ( 1 , self.l ) :
            self.r [ 0 ] [ j ] += ( self.r [ i ] [ j ] += self.r [ i ] [ j - 1 ] )
            if self.r [ i ] [ j ] > 0 and self.r [ i ] [ j - 1 ] == 0 :
                self.r [ 0 ] [ j - 1 ] += 1
    print ( sum ( self.r ) )
