def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.data = [ ]
        for i in range ( 3 ) :
            self.data.append ( sys.stdin.read ( ) )
    K = sys.maxint
    max_idx = 0
    max = data [ 0 ]
    for i in range ( 1 , 3 ) :
        if max < data [ i ] :
            max = data [ i ]
            max_idx = i
    for i in range ( K ) :
        data [ max_idx ] *= 2
    print ( data [ 0 ] , data [ 1 ] , data [ 2 ] )
