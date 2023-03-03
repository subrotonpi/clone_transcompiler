def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.l = [ ]
        n = self.sc.readline ( ).strip ( )
        for i in range ( n ) :
            d = self.sc.readline ( ).strip ( )
            if d not in self.l :
                self.l.append ( d )
        print ( len ( self.l ) )
