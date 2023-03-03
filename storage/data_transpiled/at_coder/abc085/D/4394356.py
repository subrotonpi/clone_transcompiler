def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.h = math.sqrt ( self.h )
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = [ ]
        self.b = [ ]
        for i in range ( self.n ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
        self.a.sort ( )
        self.b.sort ( )
        count = 0
        for i in range ( len ( self.b ) - 1 , - 1 , - 1 ) :
            if self.b [ i ] <= self.a [ - 1 ] :
                break
            h -= self.b [ i ]
            count += 1
            if h <= 0 :
                print ( count )
                sys.exit ( )
        print ( count , int ( math.ceil ( h / float ( self.a [ - 1 ] ) ) ) )
