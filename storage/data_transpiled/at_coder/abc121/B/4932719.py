def _import ( ) : return _import ( )
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 1
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
        self.ansl = ''
        self.ari = ''
        self.sqari = ''
        self.w = ''
        self.ww = ''
        self.isvisited = True
    def main ( self ) :
        sc = sys.stdin
        self.n = self.n
        self.m = self.m
        self.c = self.c * - 1
        self.ansi = 0
        bset = [ ]
        asets = [ ]
        for i in range ( self.m ) :
            bset.append ( sc.read ( ) )
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                asets [ i ].append ( sc.read ( ) )
        for i in range ( self.n ) :
            tmp = 0
            for j in range ( self.m ) :
                tmp += bset [ j ] * asets [ i ] [ j ]
            if tmp > self.c :
                self.ansi += 1
            tmp = 0
        print ( self.ansi )
        sc.close ( )
    def gcd_int ( self , a , b ) :
        if self.a < b :
            tmpp = self.a
            self.a = b
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
