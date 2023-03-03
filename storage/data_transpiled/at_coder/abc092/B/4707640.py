def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.d = int ( self.d )
        self.x = int ( self.x )
        a = [ ]
        for i in range ( self.n ) :
            a.append ( self.x )
        for i in range ( self.n ) :
            for j in range ( 0 , self.d ) :
                if j * a [ i ] + 1 <= self.d :
                    self.x += 1
                else :
                    break
        print ( self.x )
