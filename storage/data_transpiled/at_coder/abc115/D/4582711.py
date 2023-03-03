def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.x = int ( self.x )
        self.size = [ ]
        self.patty = [ ]
        self.size.append ( self.patty [ 0 ] )
        for i in range ( 1 , n + 1 ) :
            self.size.append ( self.size [ i - 1 ] * 2 + 3 )
            self.patty.append ( self.patty [ i - 1 ] * 2 + 1 )
        print ( self.dfs ( self.n , self.x ) )
    def dfs ( self , lay , number ) :
        if self.lay == 0 :
            return 1
        if number == 1 :
            return 0
        if number <= self.size [ lay ] / 2 :
            return self.dfs ( self.lay - 1 , number - 1 )
        elif number == ( self.size [ lay ] / 2 + 1 ) :
            return self.patty [ lay - 1 ] + 1
        else :
            return self.patty [ lay - 1 ] + 1 + self.dfs ( self.lay - 1 , number - self.size [ lay - 1 ] - 2 )
