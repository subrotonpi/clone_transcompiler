def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.maxint
    def __call__ ( self , * args ) :
        self.expo = [ True ] * ( x + 1 )
        for i in range ( 2 , x + 1 ) :
            v = i * i
            while v <= x :
                self.expo [ v ] = True
                v *= i
        for i in range ( x , 1 , - 1 ) :
            if self.expo [ i ] :
                self.expo [ i ] = True
                break
