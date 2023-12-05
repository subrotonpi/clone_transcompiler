def import _solve
import os
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.readline ( )
    def g_int ( self ) :
        return int ( self.s )
    def n , a , v = g_int ( ) , g_int ( ) , g_int ( )
    def __init__ ( self , n , a , v ) :
        self.n = n
        self.a = a
        self.v = v
    def __repr__ ( self ) :
        return '<< %s >>' % repr ( self.s )
    def memo ( self , n , a , v ) :
        [ self.n , self.a ] = [ - 1 , - 1 ]
    def solve ( self , i , j ) :
        if j > 0 :
            return 0
        if self.n == n :
            return 1 if j == 0 else 0
        if self.memo [ self.n - 1 ] [ - j ] != - 1 :
            return self.memo [ self.n - 1 ] [ - j ]
        self.memo [ self.n - 1 ] = 0
        self.memo [ self.n - 1 ] += solve ( self.n + 1 , j + v [ self.n ] )
        self.memo [ self.n - 1 ] += solve ( self.n + 1 , j )
        return self.memo [ self.n - 1 ] [ - j ]
    def main ( self ) :
        solve ( 0 , 0 )
        print ( self.memo [ 0 ] [ 0 ] - 1 )
