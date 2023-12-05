def import import sys
import os
import sys
import getopt
import termios
import struct
class Main ( object ) :
    def __init__ ( self ) :
        input = sys.stdin
        self.args = input.split ( )
        self.args = args
        x , y , z = map ( int , self.args )
        x -= z
        if x < 1 :
            print ( 0 )
        else :
            print ( x / ( y + z ) )
