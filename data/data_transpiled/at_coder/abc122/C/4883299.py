def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.q = sys.stdin.read ( )
        self.qc = sys.stdin.read ( )
        self.data = [ ]
        for i in range ( 1 , n ) :
            self.data.append ( self.data [ i - 1 ] )
            if self.qc [ i ] == 'C' :
                if self.qc [ i - 1 ] == 'A' :
                    self.data.append ( self.data [ i - 1 ] + 1 )
    self.l = [ ]
    self.r = [ ]
    for i in range ( q ) :
        self.l.append ( int ( self.data [ i ] ) )
        self.r.append ( int ( self.data [ i ] ) )
    for i in range ( q ) :
        print ( self.data [ r [ i ] - 1 ] - self.data [ l [ i ] - 1 ] )
