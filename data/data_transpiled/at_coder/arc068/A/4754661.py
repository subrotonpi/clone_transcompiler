def import import sys
import os
import sys
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdout
    def run ( self ) :
        n = int ( self.raw_input )
        if n % 11 <= 6 :
            print ( ( n / 11 ) * 2 + ( n % 11 + 10 ) / 11 )
        else :
            print ( ( n / 11 ) * 2 + 2 )
