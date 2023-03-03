def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
    def __init__ ( self ) :
        self.Scanner.__init__ ( self )
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( self.a [ i ] )
    count = 0
    prev = [ ]
    for i in range ( self.N ) :
        for j in range ( 9 ) :
            if a [ i ] [ j ] == 'x' :
                count += 1
            elif a [ i ] [ j ] == 'o' and prev [ j ] != 'o' :
                count += 1
            prev [ j ] = a [ i ] [ j ]
    sys.stdout.write ( count )
