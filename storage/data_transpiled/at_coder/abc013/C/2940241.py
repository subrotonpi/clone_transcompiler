def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import readline
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.H = 0
        self.A = 0
        self.B = 0
        self.C = 0
        self.D = 0
        self.E = 0
        print ( self.solve ( ) )
    def solve ( self ) :
        ans = sys.maxint
        for i in range ( 0 , N ) :
            R = N * E - self.H - i * self.B - i * self.E
            j = ( R + self.D + self.E ) / ( self.D + self.E )
            if j < 0 : j = 0
            cost = i * self.A + j * self.C
            ans = min ( cost , ans )
        return ans
    @ property
    def readline ( self ) :
        if not self.readline or not self.readline :
            try :
                return readline ( self )
            except EOFError :
                pass
        return readline ( self )
    def readline ( self ) :
        return readline ( self )
    def select ( self , result ) :
        return [ ]
    def result ( self ) :
        return [ ]
    def write ( self , output ) :
        return [ ]
