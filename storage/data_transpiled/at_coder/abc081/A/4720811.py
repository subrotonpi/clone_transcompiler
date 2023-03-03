def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import sys
import termios
import struct
class Main ( object ) :
    def __init__ ( self , buffer = None ) :
        self.buffer = None
        try :
            return readline.readline ( )
        except IOError :
            raise
    def read ( self ) :
        if not buffer or not buffer [ 0 ] :
            buffer = [ ]
        return buffer
    def readline ( self ) :
        return sys.stdin.readline ( )
    def read_int ( self ) :
        return int ( self.read ( ) )
    def read_int ( self , loop ) :
        result = [ ]
        for i in range ( loop ) :
            result.append ( read_int ( self ) )
        return result
    def split_int ( self ) :
        tmp = read ( ).split ( '' )
        result = [ int ( i ) for i , n in zip ( tmp [ : n ] , tmp [ n + 1 : ] ) ]
        return result
    def read_long ( self ) :
        return long ( self.read ( ) )
    def read_float ( self ) :
        return float ( self.read ( ) )
    def run ( self ) :
        input = readline ( self ).split ( '' )
        count = 0
        if input [ 0 ] == '1' :
            count += 1
        if input [ 1 ] == '1' :
            count += 1
        if input [ 2 ] == '1' :
            count += 1
        print ( count )
