def _import ( ) : return
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
        self.map = [ ]
        self.used = [ ]
        self.f = 0
        self.s = 0
        self.mod = 1000000007
        self.saitan = [ ]
    def main ( self ) :
        with open ( self.filename ) as sc :
            n , s = sc.read ( ).split ( )
    def f ( self ) :
        s = s [ 0 ]
        s = s [ 1 : ]
        c = 0
        oc = 0
        mode = 0
        for i in range ( len ( s ) ) :
            if mode == 0 :
                if s [ i ] == ')' :
                    mode = 1
                else :
                    mode = 2
            if mode == 1 :
                if s [ i ] == ')' :
                    c += 1
                else :
                    for j in range ( c ) :
                        s.insert ( 0 , '(' )
                    i += c - 1
                    mode = 0
                    c = 0
            elif mode == 2 :
                if s [ i ] == '(' :
                    oc += 1
                else :
                    oc -= 1
                if oc == 0 :
                    mode = 0
        if c > 0 :
            for i in range ( c ) :
                s.insert ( 0 , '(' )
        if oc > 0 :
            for i in range ( oc ) :
                s.append ( ')' )
        ans = ''.join ( s )
        print ( ans )
    def lowerbond ( self , k , data ) :
        min = - 1
        max = len ( data )
        while max - min > 1 :
            mid = ( max + min ) // 2
            if data [ mid ] >= k :
                max = mid
            else :
                min = mid
        return data [ max ]
    def cal ( self , n ) :
        x = long ( self )
        for i in range ( n - 1 , 0 , - 1 ) :
            x *= i
            x %= mod
        return