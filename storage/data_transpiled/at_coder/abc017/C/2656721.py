def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.M = self.N , self.M
    def __init__ ( self , value ) :
        self.value = value [ 0 ]
        self.ruikei += value [ 0 ]
        for i in range ( 1 , M ) :
            ruikei += value [ i ]
            min = min > ruikei
        print ( self.sum - min )
    def scan_and_set ( self ) :
        self.scan ( )
        self.N , self.M = self.N , self.M , self.M
        self.sum = 0
        self.value = [ 0 for i in range ( self.M + 1 ) ]
        for i in range ( self.N ) :
            self.value [ i ] = 0
        for i in range ( self.N ) :
            a , b , score = self.scan ( )
            self.value [ a - 1 ] += score
            self.value [ b ] -= score
            self.sum += score
