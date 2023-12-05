def import _solve
import os
import sys
class Problem ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.C = [ ]
        self.MOD = int ( 1e9 ) + 7
    def solve ( self ) :
        with open ( "/proc/problem" , "r" ) as f :
            self.N = f.read ( )
            self.C = [ ]
            for i in range ( self.N ) :
                self.C.append ( f.read ( ) )
    def solve ( self ) :
        d = { }
        dp = [ 1 ] * self.N
        dp [ self.N - 1 ] = self.C [ self.N - 1 ]
        for i in range ( self.N - 2 , - 1 , - 1 ) :
            n = d.get ( C [ i ] , - 1 )
            if n > i + 1 :
                dp [ i ] = ( self.dp [ i + 1 ] + self.dp [ n ] ) % MOD
            else :
                dp [ i ] = self.dp [ i + 1 ]
            d [ C [ i ] ] = i
        return dp
class Main ( object ) :
    def __init__ ( self ) :
        print ( Problem ( ).solve ( ) )
