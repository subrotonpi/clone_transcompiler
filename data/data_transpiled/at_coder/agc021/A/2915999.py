def import string
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self.k = len ( s )
        c = ord ( s [ 0 ] )
        for i in range ( 1 , k ) :
            if s [ i ] != '9' :
                print ( c + 9 * ( k - 1 ) - 1 )
                return
        print ( c + 9 * ( k - 1 ) )
