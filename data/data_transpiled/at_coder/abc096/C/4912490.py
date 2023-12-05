def _import ( ) : return
import time
import math
import os
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.c = 0
        self.k = 0
        self.m = 0
        self.height = 0
        self.width = 0
        self.lef = 0
        self.rig = 0
        self.s = ''
        self.anss = ''
        self.times = [ ]
        self.ans = 0
        self.w = ''
        self.ww = [ ]
        self.visit = [ ]
    def go ( self ) :
        sc.close ( )
        self.height = sc.height
        self.width = sc.width
        self.s = ''
        self.bool = [ ]
        ans = True
        for i in range ( self.height + 2 ) :
            for j in range ( self.width + 2 ) :
                self.bool [ i ] [ j ] = False
        for i in range ( 1 , self.height + 1 ) :
            self.s.append ( sc.next ( ) )
            for j in range ( 1 , self.width + 1 ) :
                self.bool [ i ] [ j ] = ( s [ i ] [ j - 1 ] == '#' )
        for i in range ( 1 , self.height + 1 ) :
            for j in range ( 1 , self.width + 1 ) :
                if self.bool [ i ] [ j ] :
                    if self.bool [ i - 1 ] [ j ] or self.bool [ i + 1 ] [ j ] or self.bool [ i ] [ j - 1 ] or self.bool [ i ] [ j + 1 ] :
                        continue
                    else :
                        ans = False
        if ans :
            print ( 'Yes' )
        else :
            print ( 'No' )
