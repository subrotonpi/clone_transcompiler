def import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.tokens = sys.stdin.readline ( ).split ( )
    def __getitem__ ( self , item ) :
        return self.tokens [ item ]
    def __setitem__ ( self , item , value ) :
        self.tokens = [ ]
    def __iter__ ( self ) :
        for i in range ( 0 , k ) :
            for j in range ( 0 , k ) :
                if s >= i + j and s - ( i + j ) <= k :
                    count += 1
                if s < i + j :
                    break
            if s < i :
                break
        print ( count )
