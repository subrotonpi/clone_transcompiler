def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.argv [ 0 ]
    def __call__ ( self , * args ) :
        x = int ( args )
        a = x / 11
        count = a * 2
        if x % 11 > 6 :
            count += 2
        elif x % 11 > 0 :
            count += 1
        print ( count )
