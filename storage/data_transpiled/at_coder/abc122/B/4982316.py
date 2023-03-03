def _import ( ) : return
import os
import sys
import os
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.ansi = 0
        self.w = [ ]
        self.ww = [ ]
        self.isvisited = [ ]
    def main ( self ) :
        with open ( self.filename ) as sc :
            s = sc.read ( )
            cnt = 0
            ans = 0
            for c in s :
                if c in [ 'A' , 'T' , 'G' , 'C' ] :
                    cnt += 1
                else :
                    ans = max ( ans , cnt )
                    cnt = 0
            ans = max ( ans , cnt )
            print ( ans )
            sc.close ( )
    def gcd_int ( a , b ) :
        if a < b :
            tmpp = a
            a , b = b , tmpp
        if b == 0 :
            return a
        else :
            return gcd_int ( b , a % b )
    def gcd_long ( a , b ) :
        if a < b :
            tmpp = a
            a , b = b , tmpp
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
        for w in self.w :
            if isvisited [ w ] == False :
                success = False
                break
        if success :
            self.ansi += 1
            isvisited [ w ] = False
            return
        for w in self.w :
            if w in isvisited [ w ] :
                if isvisited [ w ] == False :
                    continue
        return True
