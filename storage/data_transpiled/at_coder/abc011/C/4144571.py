def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def __init__ ( self ) :
        self.ng = [ int ( sys.stdin.readline ( ) ) , int ( sys.stdin.readline ( ) ) , int ( sys.stdin.readline ( ) ) ]
        self.ng = [ int ( sys.stdin.readline ( ) ) , int ( sys.stdin.readline ( ) ) ]
        self.ng = [ int ( sys.stdin.readline ( ) ) , int ( sys.stdin.readline ( ) ) ]
        self.minMoves = [ 1000 ]
        self.minMoves.append ( 0 )
        for i in range ( self.n , - 1 , - 1 ) :
            if i in [ self.ng [ 0 ] , self.ng [ 1 ] , self.ng [ 2 ] ] :
                continue
            for j in range ( 1 , 3 ) :
                if i - j >= 0 :
                    self.minMoves [ i - j ] = min ( self.minMoves [ i ] + 1 , self.minMoves [ i - j ] )
        if self.minMoves [ 0 ] <= 100 :
            self.print ( "YES" )
        else :
            self.print ( "NO" )
