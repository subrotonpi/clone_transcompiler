def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sx = sys.maxint
        self.sy = sys.maxint
        self.tx = sys.maxint
        self.ty = sys.maxint
        self.lines = [ ]
        w = abs ( sx - self.tx )
        h = abs ( sy - self.ty )
        for i in range ( h ) :
            self.lines.append ( "U" )
        for i in range ( w + 1 ) :
            self.lines.append ( "R" )
        for i in range ( h + 1 ) :
            self.lines.append ( "D" )
        for i in range ( w + 1 ) :
            self.lines.append ( "L" )
    def __repr__ ( self ) :
        return "%s(%s)" % ( self.sx , self.sy )
