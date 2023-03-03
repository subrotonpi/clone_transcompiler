def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.p = [ ]
        sum = 0
        for i in range ( n ) :
            self.p.append ( self.p [ i ] )
            sum += self.p [ i ]
        m = sys.stdin.readline ( ).strip ( )
        for a , b in zip ( self.p , self.p ) :
            print ( sum - self.p [ a - 1 ] + b )
