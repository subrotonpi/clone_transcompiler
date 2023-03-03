def _import ( ) : return _import ( )
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
        self.w = [ ]
        self.ww = [ ]
        self.isvisited = [ ]
    def main ( self ) :
        sc = open ( self.n )
        self.m = 0
        self.ansi = 1
        self.piv = 0
        self.needs = [ ]
        for i in range ( self.m ) :
            self.needs.append ( sc.read ( ) )
        self.needs.sort ( key = lambda a : int ( a [ 1 ] ) )
        self.piv = self.needs [ 0 ] [ 1 ] - 1
        for i in range ( 1 , self.m ) :
            if self.needs [ i ] [ 0 ] <= self.piv :
                continue
            else :
                piv = self.needs [ i ] [ 1 ] - 1
                self.ansi += 1
        print ( self.ansi )
        sc.close ( )
    def gcd_int ( self , a , b ) :
        if self.a < b :
            tmpp = self.a
            self.b = tmpp
        if self.b == 0 :
            return a
        else :
            return gcd_int ( self , a % b )
    def gcd_long ( self , a , b ) :
        if self.a < b :
            tmpp = self.a
            self.b = tmpp
        if self.b == 0 :
            return a
        else :
            return gcd_long ( self , a % b )
