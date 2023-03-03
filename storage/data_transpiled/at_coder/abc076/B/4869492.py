def import import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        input = sys.stdin
        n = int ( input.readline ( ) )
        k = int ( input.readline ( ) )
        print ( self.calc ( n , 1 , k , 1 ) )
    def calc ( k , count , increment_value , sum ) :
        if count > k :
            return sum
        return min ( self.calc ( k , count + 1 , increment_value , sum * 2 ) , self.calc ( k , count + 1 , increment_value , sum + increment_value ) )
