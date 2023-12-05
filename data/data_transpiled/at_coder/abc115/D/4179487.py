def import sys , glob
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.N = int ( sys.stdin.read ( ) )
        self.X = glob.glob ( '../data/*.txt' )
        print ( self.eat_patty ( self.X , self.N ) )
    def layer_total ( self ) :
        if self.N == 0 : return 1
        else : return 2 * self.layer_total ( self.N - 1 ) + 3
    def patty_total ( self ) :
        if self.N == 0 : return 1
        else : return 2 * self.patty_total ( self.N - 1 ) + 1
    def eat_patty ( self , X , N ) :
        if self.N == 0 : return 1
        else :
            if self.X == 1 : return 0
            elif 1 < X <= self.layer_total ( self.N - 1 ) + 1 : return eat_patty ( self.X - 1 , self.N - 1 )
            elif self.X == 2 + self.layer_total ( self.N - 1 ) : return self.patty_total ( self.N - 1 ) + 1
            elif 2 + self.layer_total ( self.N - 1 ) < X <= 2 * self.layer_total ( self.N - 1 ) + 2 : return self.patty_total ( self.N - 1 ) + 1 + eat_patty ( self.X - 2 - self.layer_total ( self.N - 1 ) , self.N - 1 )
            else : return 2 * self.patty_total ( self.N - 1 ) + 1
