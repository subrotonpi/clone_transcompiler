def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.m = self.m
        self.wrc = [ 0 ] * ( self.n + 1 )
        self.wrn = [ 0 ] * ( self.n + 1 )
        for s , t in zip ( self.wrc , self.wrc ) :
            self.wrc [ s - 1 ] += 1
            self.wrc [ t ] -= 1
            self.wrn [ s - 1 ] += self.i
            self.wrn [ t ] -= self.i
    brni = [ True ] * m
    linecnt = 0
    for i in range ( self.n ) :
        self.wrc [ i + 1 ] += self.wrc [ i ]
        self.wrn [ i + 1 ] += self.wrn [ i ]
    for i in range ( self.n ) :
        if self.wrc [ i ] == 1 and self.brni [ self.wrn [ i ] ] :
            self.brni [ self.wrn [ i ] ] = False
            linecnt += 1
    print ( self.m - linecnt )
    for i in range ( self.m ) :
        if self.brni [ i ] :
            print ( i + 1 )
