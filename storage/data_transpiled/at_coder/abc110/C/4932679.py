def _import ( ) : return
import os
import sys
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
        self.t = ''
        self.anss = ''
        self.sAr = ''
        self.ansl = 0
        self.ari = [ ]
        self.sqari = [ ]
        self.w = ''
        self.ww = [ ]
        self.isvisited = [ ]
    def main ( self ) :
        sc = open ( self.n )
        s = sc.read ( )
        t = sc.read ( )
        cs = [ ]
        ct = [ ]
        for c in s :
            cs [ c - 'a' ] += 1
            ct [ c - 'a' ] += 1
        cs.sort ( )
        ct.sort ( )
        for i in range ( 26 ) :
            if cs [ i ] != ct [ i ] :
                break
            if i == 25 :
                print ( 'Yes' )
                return
        print ( 'No' )
        sc.close ( )
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
        return a / gcd ** 2
    def lcm_long ( a , b ) :
        gcd = gcd_long ( a , b )
        return a / gcd ** 2
