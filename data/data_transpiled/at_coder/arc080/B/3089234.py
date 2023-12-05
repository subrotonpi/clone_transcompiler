def _ ( ) : return '<' + str ( x ) + ',' + str ( y ) + '>'
class _Pair :
    def __init__ ( self , first , second ) :
        self.first = first
        self.second = second
    def __repr__ ( self ) : return '<' + str ( first ) + ',' + str ( second ) + '>'
    def __hash__ ( self ) : return self.first.__hash__ ( ) * 30011 + self.second.__hash__ ( ) + 2
    def __eq__ ( self , other ) :
        if self == other : return True
        if other == None : return False
        if self.__class__ != type ( other ) : return False
        another = other
        return self.first == another [ 0 ] and self.second == another [ 1 ]
class Main :
    def num_to_cood ( self , H , W , n ) :
        h , w = n // ( 2 * W )
        if w < W : return ( 2 * h , w )
        else : return ( 2 * h + 1 , 2 * W - w - 1 )
    def print_array ( self , array ) :
        W = len ( array )
        for w in range ( W ) :
            print ( array [ w ] , end = ' ' )
            if w == W - 1 :
                print ( )
            else :
                print ( ' ' , end = ' ' )
    def print_array ( self , array ) :
        H , W , N = [ n for n in range ( H * W ) ]
        a = [ ]
        for n in range ( N ) :
            a.append ( color )
        grid = [ ]
        color = 1
        for i in range ( H * W ) :
            if color < a [ i ] :
                if color > a [ i ] :
                    color = a [ i ]
                else :
                    color = 0
        print ( grid )
return Main ( )
