def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
    A = [ ]
    for i in range ( N ) :
        A.append ( sys.stdin.read ( ) )
    count = 0
    for i in range ( N ) :
        for j in range ( 0 , j * A [ i ] + 1 <= D ) :
            count += 1
    print ( count , X )
