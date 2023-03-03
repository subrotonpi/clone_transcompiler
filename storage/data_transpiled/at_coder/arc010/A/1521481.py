def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.c = [ ]
        for i in range ( self.M ) :
            self.c.append ( self.c [ i ] )
        self.card = self.N
        for i in range ( self.M ) :
            if self.card <= self.A :
                self.card += self.B
            self.card -= self.c [ i ]
            if self.card < 0 :
                print ( self.i + 1 )
                return
        print ( "complete" )
