def import time
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.t = int ( self.t )
        self.a = [ ]
        time = 0
        for i in range ( self.n ) :
            self.a.append ( self.a [ i ] )
            time += t
        for i in range ( 1 , self.n ) :
            if self.a [ i - 1 ] + t >= self.a [ i ] :
                time += self.a [ i ] - self.a [ i - 1 ] - t
        print ( time )
