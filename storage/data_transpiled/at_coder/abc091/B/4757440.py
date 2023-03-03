def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.s = [ ]
        for i in range ( self.x ) :
            self.s.append ( i )
        self.n = len ( self.s )
        self.t = [ ]
    def num ( self ) :
        sco = 0
        for i in range ( self.x ) :
            for k in range ( self.x ) :
                if self.s [ i ] == self.s [ k ] :
                    num += 1
            for j in range ( self.n ) :
                if self.s [ i ] == self.t [ j ] :
                    num -= 1
            if num > sco :
                sco = num
            num = 0
        print ( sco > 0 )
