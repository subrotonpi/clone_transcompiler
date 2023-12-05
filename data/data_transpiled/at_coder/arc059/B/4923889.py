def _import ( ) : return _import ( )
import math
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.x = c
        self.k = k
        self.m = m
        self.height = height
        self.width = width
        self.left = left
        self.right = right
        self.ans = ans
        self.s = ''
        self.anss = ''
        self.sAr = ''
        self.ansl = ''
        self.intAr = ''
        self.intAr = ''
        self.w = ''
        self.ww = ''
        self.isvisited = False
    def main ( self ) :
        sc = Scanner ( )
        s = sc.next ( )
        bool = False
        piv2 = piv3 = 0
        for i in range ( len ( s ) - 1 ) :
            if s [ i ] == s [ i + 1 ] :
                piv2 = i
                bool = True
                break
            else :
                continue
        if bool :
            print ( ( piv2 + 1 ) , piv2 + 2 )
            return
        if bool == False :
            for i in range ( len ( s ) - 2 ) :
                if s [ i ] == s [ i + 2 ] :
                    piv3 = i
                    bool = True
                    break
        if bool == False :
            print ( ( piv3 + 1 ) , piv3 + 3 )
            return
        if bool == False :
            print ( - 1 , - 1 )
            return
        sc.close ( )
    def gcd_int ( self , a ) :
        if a < b :
            tmpp = self.a
            self.b = tmpp
        if b == 0 :
            return a
        else :
            return gcd_int ( b , a % b )
    def lcm_long ( self , a ) :
        if a < b :
            tmpp = self.a
            self.b = tmpp
        if b == 0 :
            return a
        else :
            return gcd_long ( b , a % b )
