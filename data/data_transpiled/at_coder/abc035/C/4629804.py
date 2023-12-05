def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.Q = self.Q
    def run ( self ) :
        a = [ 0 ] * ( N + 1 )
        for start , end in self.N :
            a [ start - 1 ] += 1
            a [ end ] -= 1
        b = [ a [ 0 ] ]
        for i in range ( 1 , N ) :
            b [ i ] = b [ i - 1 ] + a [ i ]
        for i in b :
            print ( ( 0 if i % 2 == 0 else 1 ) , end = ' ' )
        print ( )
