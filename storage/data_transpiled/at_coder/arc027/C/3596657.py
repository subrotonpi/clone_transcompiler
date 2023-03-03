def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import time
import sys
import itertools
import string
import string
import sys
class Main ( readline ) :
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( readline ( ) )
    def __next__ ( self ) :
        return int ( __next__ ( ) )
    def __next__ ( self ) :
        return int ( __next__ ( ) )
    def __next__ ( self ) :
        return int ( __next__ ( ) )
    def __next__ ( self ) :
        return int ( __next__ ( ) )
    def solve ( ) :
        dp = [ ]
        for arr in reversed ( range ( max_item_available ( ) + 1 ) ) :
            arr = [ ]
        dp.append ( [ 0 ] )
        for i in range ( 0 , N ) :
            calc ( dp , T [ i ] , H [ i ] )
        ans = - 1
        for i in range ( 0 , max_item_available ( ) + 1 ) :
            for j in range ( 0 , X + Y ) :
                ans = max ( dp [ i ] [ j ] , ans )
        return ans
    def __next__ ( self ) :
        return min ( X , N )
    from itertools import chain
    for i in chain ( enumerate ( chain ( * repeat ( sys.argv [ 1 : ] ) ) ) , repeat ( sys.argv [ 1 : ] ) ) :
        if i == 0 or not next ( iter ( reversed ( chain ( * repeat ( sys.argv [ 1 : ] ) ) ) ) ) :
            try :
                next ( iter ( reversed ( sys.argv [ 1 : ] ) ) )
            except StopIteration :
                pass
