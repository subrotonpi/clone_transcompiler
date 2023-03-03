def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.E = 1.0e-9
    def __call__ ( self , * args ) :
        Scanner ( ).__init__ ( self )
        self.ax , self.ay = args
        self.dx , self.dy = args [ 0 ] - self.ax , args [ 1 ] - self.ay
        n = len ( args )
        x , y = [ ] , [ ]
        for u , v in zip ( self.ax , self.ay ) :
            x.append ( ( self.dx * u + self.dy * v ) / ( self.dx * dx + self.dy * dy ) )
            y.append ( ( - self.dy * u + self.dx * v ) / ( self.dx * dx + self.dy * dy ) )
        k = 0
        for i in range ( n ) :
            if self.y [ i ] * self.y [ ( i + 1 ) % n ] >= 0 :
                continue
            z = self.x [ i ] * self.y [ ( i + 1 ) % n ] - self.x [ ( i + 1 ) % n ] * self.y [ i ]
            z /= - self.y [ i ] + self.y [ ( i + 1 ) % n ]
            if z > self.E and z < 1 - self.E :
                k += 1
        print ( k / 2 + 1 )
