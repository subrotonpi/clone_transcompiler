def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s , self.t = sys.stdin.read ( ).split ( '\n' )
        self.s , self.t = int ( self.s ) , int ( self.t )
        print ( self.t - self.s + 1 )
