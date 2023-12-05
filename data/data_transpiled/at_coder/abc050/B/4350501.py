def import time
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.t = [ ]
        time = 0
        for i in range ( self.n ) :
            self.t.append ( time )
            time += self.t [ i ]
        self.m = int ( self.m )
        for i in range ( self.m ) :
            p = self.p
            x = self.x
            print ( time - ( self.t [ p - 1 ] - x ) )
