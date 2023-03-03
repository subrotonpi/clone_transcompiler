def _import ( ) : return _import ( '' )
import sys
import os
import os
import set
import math
import os
import sys
class Main ( ) :
    rd = open ( sys.stdin )
    def fill_to_the_brick ( self ) :
        for i in range ( self.lower , self.upper + 1 ) :
            self.to_try.append ( i )
    def _intarr ( self ) :
        return self.read ( )
    def _compute ( self ) :
        k = len ( self.split ( ) [ 1 ] )
        a = [ int ( i ) for i in self.split ( ) ]
        res = solve ( k , a )
        self.out ( res )
    def _solve ( self , k , a ) :
        n = len ( a )
        one = 0
        for i in range ( 1 , n ) :
            if a [ i ] == 1 :
                one = i
                break
        tryset = { max ( 0 , one - k + 1 ) : one }
        if k < 4 :
            tryset.fill_to_the_brick ( )
        else :
            for i in range ( - 3 , 3 ) :
                tryset [ i ] = one + i
                tryset [ i ] = one - k + i
        k1 = self.k - 1
        z = one
        left = z // k1
        if z % k1 == 0 :
            left += 1
        pre = z - left * k
        for i in range ( - 3 , 3 ) :
            tryset [ i ] = i - pre + one
        r = n - ( z + k )
        right = r // k1
        if r % k1 == 0 :
            right += 1
        post = r - right * k
        for i in range ( - 3 , 3 ) :
            tryset [ i ] = i - post + one
    mi = sys.maxsize
    for z in tryset.to_try :
        mi = min ( ops ( z , k , n ) , mi )
    def ops ( z , k , n ) :
        left = rem ( z , k )
        right = rem ( n - z - k , k )
        return left + 1 + right
    def _eval ( )