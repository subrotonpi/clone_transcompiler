def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.set = sorted ( [ 1 ] )
        for i in range ( 2 , math.sqrt ( n ) + 1 ) :
            for j in range ( i ** 2 , n + 1 ) :
                self.set.append ( j )
        print ( self.last ( ) )
