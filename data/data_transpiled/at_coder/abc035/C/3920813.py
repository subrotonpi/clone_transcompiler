def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.q = self.q
        re = [ 0 ] * ( self.q + 1 )
        for i in range ( self.q ) :
            re [ self.q - 1 ] += 1
            re [ self.q ] += - 1
        for i in range ( self.n ) :
            re [ i + 1 ] += re [ i ]
            if re [ i ] % 2 == 0 :
                print ( '0' , end = ' ' )
            else :
                print ( '1' , end = ' ' )
        print ( )
