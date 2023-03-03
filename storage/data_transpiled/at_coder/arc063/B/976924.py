def import import sys
import math
import os
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.line = sys.stdin.readline ( )
        self.sp = self.line.split ( )
        self.n = int ( self.sp [ 0 ] )
        self.line = sys.stdin.readline ( )
        self.sp = self.line.split ( )
        self.a = [ int ( x ) for x in self.sp ]
        self.min = int ( self.a [ 0 ] )
        self.max = 0
        self.count = 0
        for x in self.a :
            min = min ( x )
            if x - self.min > self.max :
                self.max = x - self.min
                self.count = 1
            elif x - self.min == self.max :
                self.max = x - self.min
                self.count += 1
        print ( self.count )
