def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.max = None
        self.q = [ 0 ] * 1000002
        for i in range ( self.a ) :
            b , c = self.a , self.b
            self.q [ b ] += 1
            self.q [ c + 1 ] -= 1
        for i in range ( 0 , 1000000 ) :
            self.q [ i + 1 ] += self.q [ i ]
            if self.max < self.q [ i ] :
                self.max = self.q [ i ]
        print ( self.max )
