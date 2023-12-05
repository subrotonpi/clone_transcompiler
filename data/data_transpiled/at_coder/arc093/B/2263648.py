def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.num_white = self.num_white
        self.num_black = self.num_black
        WHITE = '.'
        BLACK = '#'
    def __init__ ( self , * args ) :
        self.stdin.close ( )
        self.num_white = self.num_white
        self.num_black = self.num_black
        self.WHITE = '.'
        self.BLACK = '#'
        self.map = [ [ WHITE if j <= 49 else BLACK for j in range ( 100 ) ] for i in range ( 100 ) ]
        count = 1
        for i in range ( 0 , 100 , 2 ) :
            for j in range ( 0 , 49 , count < self.num_black , 2 ) :
                self.map [ i ] [ j ] = BLACK
                count += 1
        count = 1
        for i in range ( 0 , 100 , 2 ) :
            for j in range ( 51 , 100 , count < self.num_white , 2 ) :
                self.map [ i ] [ j ] = WHITE
                count += 1
        print ( "100 100" )
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                print ( "%c" % self.map [ i ] [ j ] )
            print ( )
