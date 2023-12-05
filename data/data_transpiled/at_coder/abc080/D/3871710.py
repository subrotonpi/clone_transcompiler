def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.s = [ ]
        self.t = [ ]
        self.c = [ ]
    def run ( self ) :
        self.s = [ ]
        self.t = [ ]
        self.c = [ ]
        for i in range ( self.N ) :
            self.s.append ( i )
            self.t.append ( i )
            self.c.append ( i )
        self.time = [ 0 ] * 200002
        self.sum = [ ]
        for i in range ( 1 , C + 1 ) :
            for j in range ( 200002 ) :
                self.time.append ( 0 )
            for j in range ( self.N ) :
                if self.c [ j ] == i :
                    self.time [ self.s [ j ] * 2 - 1 ] += 1
                    self.time [ t [ j ] * 2 ] -= 1
            for j in range ( 1 , 200002 ) :
                self.time [ j ] += self.time [ j - 1 ]
            for j in range ( 1 , 200002 ) :
                if self.time [ j ] > 0 :
                    self.sum [ j ] += 1
        self.max = - 1
        for i in range ( self.N ) :
            self.max = max ( self.sum [ i ] )
        print ( self.max )
