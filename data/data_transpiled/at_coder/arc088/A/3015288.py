def import import sys
import string
import time
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def __call__ ( self , X , Y ) :
        return string.split ( X ) [ 0 ]
    def __init__ ( self , X , Y ) :
        self.X = X
        self.Y = Y
        self.a = X
        cnt = 0
        while self.a <= Y :
            self.a *= 2
            cnt += 1
        print ( cnt )
