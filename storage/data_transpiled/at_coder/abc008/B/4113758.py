def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.readline ( ).strip ( )
    def __init__ ( self ) :
        self.n = sys.stdin.readline ( ).strip ( )
    def __init__ ( self ) :
        self.arr = [ ]
        for i in range ( self.n ) :
            self.arr.append ( self.arr [ i ] )
    def __repr__ ( self ) :
        return "<%s>" % repr ( self.arr )
    def start ( self ) :
        self.count = 0
        self.max = 0
        self.name = ""
        for i in range ( self.n ) :
            if i == 0 :
                self.count = 1
                continue
            if self.arr [ i ] == self.arr [ i - 1 ] :
                self.count += 1
            else :
                if self.max < self.count :
                    self.name = self.arr [ i - 1 ]
                    self.max = self.count
                self.count = 1
        if self.max < self.count :
            self.name = self.arr [ n - 1 ]
            self.max = self.count
        print ( self.name )
