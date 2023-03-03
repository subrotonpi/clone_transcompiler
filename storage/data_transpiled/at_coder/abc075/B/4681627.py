def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    H = int ( H )
    W = int ( W )
    self.raw_input = raw_input
    S = [ ]
    ( height , width ) = H
    number = [ ]
    tmp = [ ]
    for line in self.raw_input ( ).split ( '\n' ) :
        tmp.append ( line )
    for i in range ( H ) :
        tmp = tmp [ i ].split ( '' )
        for j in range ( W ) :
            S.append ( [ i , j ] )
    for i in range ( H ) :
        for j in range ( W ) :
            if S [ i ] [ j ] == '#' :
                print ( S [ i ] [ j ] , end = ' ' )
            else :
                number [ i ] [ j ] = self.count_mine ( i , j , height , width , S )
                print ( number [ i ] [ j ] , end = ' ' )
        print ( )
