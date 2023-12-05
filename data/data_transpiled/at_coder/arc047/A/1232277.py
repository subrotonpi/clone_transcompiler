def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.l = self.s.split ( ' ' )
        self.log = self.s.split ( ' ' )
        tab , res = 1 , 0
        for i in range ( self.n ) :
            tab += 1 if log [ i ] == '+' else - 1
            if tab > self.l :
                tab = 1
                res += 1
        print ( res )
