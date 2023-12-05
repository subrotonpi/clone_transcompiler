def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.s = sys.stdin.readline ( ).split ( )
        self.a = [ int ( i ) for i in self.s [ : 10 ] ]
        self.max = 0
        self.sum = 0
        for i in range ( self.n ) :
            self.sum += self.a [ i ]
            self.max = max ( self.a [ i ] )
        if self.max < self.sum - self.max :
            print ( "Yes" )
        else :
            print ( "No" )
