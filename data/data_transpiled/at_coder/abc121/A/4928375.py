def import _main
import os
import sys
import os
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.ni = 0
        self.hi = 0
        self.wi = 0
        self.lefi = 0
        self.rigi = 0
        self.ansi = 0
        self.s = ''
        self.anss = ''
        self.sAr = ''
        self.ansl = 0
        self.ari = [ ]
        self.sqari = [ ]
        self.w = [ ]
        self.ww = [ ]
        self.isvisited = [ ]
    def main ( self ) :
        with open ( self.filename , 'r' ) as f :
            h , w , hh , ww = f.read ( )
            print ( ( h - hh ) * ( w - ww ) )
            f.close ( )
    def gcd_int ( a , b ) :
        if a < b :
            tmpp = a
            a = b
            b = tmpp
        if b == 0 :
            return a
        else :
            return gcd_int ( b , a % b )
    def gcd_long ( a , b ) :
        if a < b :
            tmpp = a
            a = b
            b = tmpp
        if b == 0 :
            return a
        else :
            return gcd_long ( b , a % b )
    def lcm_int ( a , b ) :
        gcd = gcd_int ( a , b )
        return a / gcd * b
    def lcm_long ( a , b ) :
        gcd = gcd_long ( a , b )
        return a / gcd * b
    def dfs ( self , placenow ) :
        isvisited [ placenow ] = True
        success = True
        for i in range ( self.n ) :
            if isvisited [ i ] == False :
                success = False
                break
        if success :
            self.ansi += 1
            isvisited [ placenow ] = False
            return
        for i in range ( self.n ) :
            if w [ i ] == placenow and isvisited