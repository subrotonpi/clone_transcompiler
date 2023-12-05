def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.d = { }
        self.n = int ( self.sc.readline ( ) )
        for i in range ( self.n ) :
            x = self.sc.readline ( )
            if x not in self.d :
                self.d [ x ] = 0
            self.d [ x ] = self.d [ x ] + 1
        self.m = int ( self.sc.readline ( ) )
        for i in range ( self.m ) :
            x = self.sc.readline ( )
            if x not in self.d :
                self.d [ x ] = 0
            self.d [ x ] = self.d [ x ] - 1
        self.max = 0
        for i in self.d.values ( ) :
            self.max = self.max if self.max > i else i
        print ( self.max )
