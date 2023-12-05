def import _MOD
class Main ( object ) :
    def __init__ ( self , arg ) :
        self.MOD = 1000000007l
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.x = int ( self.x )
        city = [ ]
        for i in range ( self.n + 1 ) :
            city.append ( self.x )
        self.city.append ( x )
        city.sort ( )
        sa = [ ]
        for i in range ( self.n ) :
            sa.append ( city [ i + 1 ] - city [ i ] )
        if self.n != 1 :
            print ( gcd ( sa ) )
        else :
            print ( city [ 1 ] - city [ 0 ] )
    def gcd ( self , param ) :
        param = list ( param )
        g = self.gcd ( param [ 0 ] , param [ 1 ] )
        for i in range ( 1 , len ( param ) - 1 ) :
            g = gcd ( g , param [ i + 1 ] )
        return g
    def gcd ( self , a , b ) :
        if a < b :
            self.a , self.b , self.a = a ^ b , b
        r = - 1
        while r != 0 :
            r , a , b = divmod ( a , b )
        return a
