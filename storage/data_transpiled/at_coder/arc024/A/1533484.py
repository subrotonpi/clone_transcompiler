def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.L = sys.stdin.readline ( ).strip ( )
        self.R = sys.stdin.readline ( ).strip ( )
    def __init__ ( self ) :
        self.L = L
        self.R = R
        self.result = 0
        self.l = { }
        self.r = { }
        for i in range ( self.L ) :
            tmp = self.L [ i ]
            if tmp in self.l :
                self.l [ tmp ] = self.l [ tmp ] + 1
            else :
                self.l [ tmp ] = 1
        for i in range ( self.R ) :
            tmp = self.R [ i ]
            if tmp in self.l :
                if self.l [ tmp ] > 0 :
                    self.result += 1
                    self.l [ tmp ] = self.l [ tmp ] - 1
        print ( self.result )
