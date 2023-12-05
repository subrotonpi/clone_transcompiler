def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.T , X = sys.stdout.readline ( ).split ( ' ' )
        self.T = float ( self.T )
        self.X = float ( self.X )
        print ( self.T / self.X )
