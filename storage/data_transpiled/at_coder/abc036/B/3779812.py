def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , line ) :
        self.n = int ( line )
    arr = [ ]
    for i in range ( n ) :
        line = sys.stdin.readline ( )
        for j in range ( n ) :
            arr [ i ].append ( line [ j ] )
    for j in range ( n ) :
        for i in range ( n - 1 , - 1 , - 1 ) :
            sys.stdout.write ( arr [ i ] [ j ] )
        sys.stdout.write ( "\n" )
