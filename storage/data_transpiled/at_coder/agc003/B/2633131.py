def import import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.stdin.readline ( )
    def __init__ ( self ) :
        self.name = sys.stdin.readline ( )
    def go ( self ) :
        n = int ( self.name )
        count = 0
        mod = 0
        for i in range ( n ) :
            a1 = int ( self.name [ i ] )
            if a1 > 0 :
                a1 += mod
                count += ( a1 // 2 )
                mod = a1 % 2
            else :
                mod = 0
        print ( count )
