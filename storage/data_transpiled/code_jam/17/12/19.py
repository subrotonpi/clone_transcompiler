def import _raw_input
import sys
import random
import sys
import sys
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.st = [ ]
        self.P = [ ]
        self.MOD = 1000000007
        self.EPS = 0.000001
    def print ( x ) :
        print ( "%r" % x )
    def join ( self , x , space ) :
        if len ( x ) == 0 : return ""
        parts = [ ]
        first = True
        for elt in x :
            if first :
                first = False
            else :
                parts.append ( space )
            parts.append ( elt )
        return "".join ( parts )
    def __next__ ( self ) :
        while not self.st or not self.st :
            line = sys.stdin.readline ( )
            self.st = [ line.strip ( ) for line in line.split ( ) ]
        return self.st [ 0 ]
    def randint ( self ) :
        return int ( self.randrange ( self.P ) )
    def uniform ( self ) :
        return float ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self.uniform ( self ( uniform ( uniform ( self ( uniform ( uniform ( uniform ( uniform ( uniform ( uniform ( uniform ( uniform ( ( ( uniform ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( (