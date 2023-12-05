def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.po = [ ]
        for i in range ( self.m ) :
            a = self.n - 1
            b = self.n - 1
            c = self.n - 1
            for j in range ( a , b + 1 ) :
                self.po.append ( c )
        for i in range ( self.n ) :
            print ( self.po [ i ] )
