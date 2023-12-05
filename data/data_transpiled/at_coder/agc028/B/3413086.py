def import import *
import math
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.M = long ( 1e9 ) + 7
    def main ( self ) :
        n = random.randint ( 1 , 10000 )
        ps = [ ]
        nf = 1
        for i in range ( 1 , n + 1 ) :
            ps.append ( ( ps [ i - 1 ] + random.randint ( 1 , 10000 ) ) % M )
            nf = nf * i % M
        ans , s = nf * ps [ n ] % M , 0
        for i in range ( 1 , n - 1 ) :
            s = ( s + ps [ n - i ] - ps [ i ] + M ) % M
            ans = ( ans + nf * modI ( long ( i + 1 ) * ( 1 if i >= n - 1 else i + 2 ) , M ) % M * 2 * s + nf * modI ( i + 1 , M ) % M * ( ps [ i ] + ps [ n ] - ps [ n - i ] + M ) ) % M
        print ( ans )
    def modI ( a , m ) :
        return ( a % m ) <= 1 and 1 or ( 1 - modI ( m % a , a ) * m ) / a + m
class Reader ( sys.stdin ) :
    def readline ( self ) :
        while not self.stdin or not self.stdout.readline ( ) :
            try :
                self.stdin.readline ( )
            except :
                pass
        return self.stdin.readline ( )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
