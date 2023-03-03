def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.field = [ ]
        for i in range ( self.n ) :
            self.field.append ( sys.argv [ i ] )
    lines = [ ]
    for i in range ( self.n ) :
        for j in range ( self.n ) :
            lines.append ( self.field [ self.n - j - 1 ] [ i ] )
        lines.append ( '\n' )
    sys.stdout.write ( ''.join ( lines ) )
