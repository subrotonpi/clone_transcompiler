def import __main__
class Main ( object ) :
    def __init__ ( self , __ ) :
        self.n , self.x , self.ar , self.init = self.s.split ( ' ' )
    def __main__ ( self ) :
        self.ar , self.init = self.ar , self.init
        self.ar [ 0 ] = min ( self.ar [ 0 ] , self.x )
        for i in range ( 1 , n ) :
            self.ar [ i ] = min ( self.ar [ i ] , self.x - self.ar [ i - 1 ] )
        res = 0
        for i in range ( self.n ) :
            res += self.init [ i ] - self.ar [ i ]
        print ( res )
