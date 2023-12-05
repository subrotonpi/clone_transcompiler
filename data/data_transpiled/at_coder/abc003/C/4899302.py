def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.k = int ( sys.stdin.readline ( ) )
        rate = [ sys.stdin.readline ( ).strip ( ) for i in range ( self.n ) ]
        rate.sort ( key = lambda x : x [ 1 ] )
        answer = 0
        for i in range ( k - 1 , - 1 , - 1 ) :
            answer = ( answer + rate [ i ] ) / 2
        print ( answer )
