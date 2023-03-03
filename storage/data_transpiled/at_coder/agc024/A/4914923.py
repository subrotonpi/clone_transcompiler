def _import ( ) : return
import os
import sys
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.x = 0
        self.c = 0
        self.k = 0
        self.m = 1
        self.height = 0
        self.width = 0
        self.left = 0
        self.right = 0
        self.ans = 0
        self.s = ''
        self.anss = ''
        self.sAr = [ ]
        self.ansl = [ ]
        self.intAr = [ ]
        self.w = [ ]
        self.ww = [ ]
        self.isvisited = [ ]
    def main ( self ) :
        with open ( self.filename , 'r' ) as f :
            a = f.read ( )
            b = f.read ( )
            c = f.read ( )
            k = f.read ( )
            if k % 2 == 0 :
                print ( a - b )
            else :
                print ( b - a )
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
    def dfs ( self ) :
        isvisited [ self.placenow ] = True
        success = True
        for w in self.w :
            if isvisited [ w ] == False :
                success = False
                break
        if success :
            self.ans += 1
            isvisited [ w ] = False
            return 0
