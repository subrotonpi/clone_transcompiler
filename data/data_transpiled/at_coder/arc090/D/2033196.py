def _main ( ) : return
import sys
import os
mod = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
        self.pow10 = [ 1 ]
        for i in range ( 1 , 19 ) :
            self.pow10 [ i ] = self.pow10 [ i - 1 ] * 10
    def pow ( self , a ) :
        res = 1
        while b > 0 :
            if self.b & 1 == 1 :
                res = res * a % mod
            self.pow10 [ i ] = self.pow10 [ i - 1 ]
        return self.pow10 [ i ]
    def main ( self ) :
        with open ( self.s ) as f :
            while not f.readline ( ) or not f.readline ( ) :
                try :
                    f.readline ( )
                except IOError :
                    pass
            return f.readline ( )
    def solve ( self , k , l , s ) :
        maxK = int ( 9 * self.pow10 [ k - 1 ] )
        maxL = 9 * self.pow10 [ l - 1 ] * l
        res = 0
        for i in range ( 1 , maxK + 1 ) :
            if ( s - i * k ) % l == 0 and ( s - i * k ) <= maxL :
                res += 1
        return res
    def solve ( self , s ) :
        s = self.s
        result = 0
        for i in range ( 1 , s + 1 ) :
            if s % i == 0 :
                k = i
                if k > 18 or s / k <= 9 * self.pow10 [ k - 1 ] :
                    result += pow ( 10 , k - 1 ) * 9 - ( s / k ) + 1
                    result = ( result + mod ) % mod
                if i * i != s :
                    k = s / i
                    if k > 18 or s / k <= 9 * self.pow10 [ k - 1 ] :
                        result += pow ( 10 , k - 1 ) * 9 - ( s / k ) + 1
                        result = ( result + mod ) % mod
            return result
return Main
