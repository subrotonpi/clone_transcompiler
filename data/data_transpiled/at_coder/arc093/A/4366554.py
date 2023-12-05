def import import *
import string
import sys
import time
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = string
    def __getitem__ ( self , key ) :
        return int ( self.sc.get ( key ) )
    def __long__ ( self , key ) :
        return long ( self.sc.get ( key ) )
    def next_slice ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def yesno ( b ) :
        return "Yes" if b else "No"
    def maxint ( b ) :
        return int ( b )
    def minint ( b ) :
        return int ( b )
    def main ( ) :
        n = int ( n )
        ar = [ ]
        for i in range ( 1 , n + 2 ) :
            ar.append ( randint ( 0 , n ) )
        sum = 0
        for i in range ( 1 , n + 2 ) :
            sum += abs ( ar [ i ] - ar [ i - 1 ] )
        for i in range ( 1 , n + 1 ) :
            print ( sum + abs ( ar [ i + 1 ] - ar [ i - 1 ] ) - ( abs ( ar [ i + 1 ] - ar [ i ] ) + abs ( ar [ i ] - ar [ i - 1 ] ) ) )
