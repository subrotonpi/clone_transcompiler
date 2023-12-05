def import _dict_map
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.N
    def __getitem__ ( self , key ) :
        return self.sc.__getitem__ ( key )
    def __setitem__ ( self , key , value ) :
        self.d = { }
        self.dp = [ ]
        self.dp.append ( abs ( value - value ) )
        for i in range ( 2 , N ) :
            self.dp [ i ] = min ( self.dp [ i - 1 ] + abs ( value - value ) , self.dp [ i - 2 ] + abs ( value - value ) )
        print ( self.dp [ N - 1 ] )
