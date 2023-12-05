def import sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.q = int ( sys.stdin.readline ( ) )
        s = string.split ( sys.stdin.readline ( ) )
        data = [ 0 ] * n
        data [ - 1 ] = 0
        for i in range ( len ( s ) - 2 , - 1 , - 1 ) :
            data [ i ] = data [ i + 1 ]
            if s [ i ] == 'AC' :
                data [ i ] += 1
        for i in range ( self.q ) :
            l = sys.stdin.readline ( ).strip ( ) - 1
            r = sys.stdin.readline ( ).strip ( ) - 1
            print ( data [ l ] - data [ r ] )
