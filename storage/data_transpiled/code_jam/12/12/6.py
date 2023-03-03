def _ ( ) : return
import random
import sys
class B ( object ) :
    def __init__ ( self , x , y ) :
        self.a = x
        self.b = y
        self.level = 0
    def __call__ ( self , o ) :
        return o.b - self.b
