def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.count ( )
        s = [ [ ] for x in self.sc.read ( ).split ( '\n' ) ]
        for i in range ( self.N ) :
            data = self.sc.read ( )
            for j in range ( self.N ) :
                s [ i ] [ j ] = data [ j ] == 'o'
        self.sc.close ( )
        for i in range ( self.N ) :
            for j in range ( self.N - 1 , - 1 , - 1 ) :
                if s [ j ] [ i ] :
                    sys.stdout.write ( 'o' )
                else :
                    sys.stdout.write ( 'x' )
