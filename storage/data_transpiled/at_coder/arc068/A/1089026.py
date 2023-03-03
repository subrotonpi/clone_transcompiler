def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 10000
    def __call__ ( self , * args ) :
        f = open ( "/proc/self/" + str ( args ) )
        x = int ( f.read ( ) )
        sum = x / 11
        temp = x % 11
        if temp != 0 :
            print ( ( sum * 2 + 2 if temp > 6 else sum * 2 + 1 ) )
        else :
            print ( sum * 2 )
