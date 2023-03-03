def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.c = [ ]
        self.s = [ ]
        self.f = [ ]
        for i in range ( 1 , n + 1 ) :
            self.c.append ( sys.stdin.read ( ) )
            self.s.append ( sys.stdin.read ( ) )
            self.f.append ( sys.stdin.read ( ) )
    for i in range ( 1 , n + 1 ) :
        tmp = self.s [ i ] + self.c [ i ]
        for j in range ( i + 1 , n ) :
            if tmp < self.s [ j ] :
                tmp = self.s [ j ]
            else :
                tmp = self.f [ j ] * int ( math.ceil ( tmp / float ( self.f [ j ] ) ) )
            tmp += self.c [ j ]
        print ( tmp )
