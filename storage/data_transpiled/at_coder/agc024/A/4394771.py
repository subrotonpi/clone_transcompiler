def import import *
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.i = args
        a , b , c , k = self.i.split ( '.' )
        print ( a - b if k % 2 == 0 else b - a )
