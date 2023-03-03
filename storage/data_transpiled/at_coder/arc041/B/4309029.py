def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.n
        self.m = self.m
        self.field = [ ]
        self.before = [ ]
        for i in range ( self.n ) :
            arr = self.sc.readline ( ).decode ( 'utf-8' )
            for j in range ( self.m ) :
                self.field.append ( [ arr [ j ] - '0' for j in range ( self.field [ i ] [ j ] ) ] )
        for i in range ( 1 , self.n - 1 ) :
            for j in range ( 1 , self.m - 1 ) :
                x = self.field [ i - 1 ] [ j ]
                self.before.append ( [ x ] )
                self.field [ i - 1 ] [ j ] -= x
                self.field [ i + 1 ] [ j ] -= x
                self.field [ i ] [ j - 1 ] -= x
                self.field [ i ] [ j + 1 ] -= x
        lines = [ ]
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                lines.append ( before [ i ] [ j ] )
            lines.append ( '\n' )
        sys.stdout.write ( ''.join ( lines ) )
