def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 50
        self.K = 1000
    def input ( self ) :
        with open ( self.N , 'r' ) as f :
            self.K = f.read ( )
    def main ( self , args ) :
        self.input ( )
        for i in range ( self.N ) :
            self.a [ i ] = i
    quotient = K // self.N
    remainder = K % self.N
    for i in range ( self.N ) :
        self.a [ i ] += quotient
    for i in range ( self.remainder ) :
        self.a [ i ] = self.a [ i ] + self.N - ( int ( remainder ) - 1 )
    for i in range ( int ( self.remainder ) ) :
        self.a [ i ] -= self.remainder
    print ( self.N )
    for i in range ( self.N ) :
        print ( self.a [ i ] , end = ' ' )
