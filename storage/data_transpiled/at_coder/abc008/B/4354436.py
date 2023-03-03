def import import sys , string , traceback
from os import urandom
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.n = int ( sys.stdin.readline ( ) )
        self.v = [ 0 for i in range ( n ) ]
    def start ( self ) :
        self.s = [ ]
        self.v = [ 0 for i in range ( n ) ]
        for i in range ( n ) :
            self.s.append ( s [ i ] )
            for j in range ( 0 , i ) :
                if self.s [ i ] == self.s [ j ] :
                    self.v [ j ] += 1
                    break
        ans = 0
        for i in range ( 1 , n ) :
            if self.v [ ans ] < self.v [ i ] :
                ans = i
        print ( self.s [ ans ] )
