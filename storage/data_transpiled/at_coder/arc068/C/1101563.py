def _import ( stream ) : return stream.read ( 1024 )
import sys
import struct
import sys
import termios
import struct
import termios
import sys
class Main ( termios.Struct ) :
    def __init__ ( self ) :
        try :
            with sopen ( sys.stdin ) as f :
                self.solve ( f )
        except :
            self.solve ( )
    def read ( ) :
        while isdel ( ) :
            c = ord ( ' ' )
            if c < 0 or c > '9' : raise InputError ( )
            l *= 10
            c = read ( )
        return l * sgn
    def read ( ) :
        while isdel ( ) :
            c = read ( )
        while isdel ( ) :
            c = ord ( ' ' )
            if c == '\n' or c == '\t' or c == - 1 : return c
        return float ( next ( ) )
    def read ( ) :
        while isdel ( ) :
            c = read ( )
        while isdel ( ) :
            c = read ( )
        if c == '\n' :
            return c
        if c == '\n' or c == '\r' or c == - 1 : return c
    def write ( ) :
        try :
            return struct.unpack ( '>d' , next ( ) ) [ 0 ]
        except StopIteration :
            raise InputError ( )
    def read ( ) :
        while isdel ( ) :
            c = read ( )
        return c
    def read ( ) :
        if not isdel ( ) : raise InputError ( )
        if not isdel ( ) : return - 1
    def write ( ) :
        try :
            return struct.unpack ( '>d' , next ( ) ) [ 0 ]
        except StopIteration :
            raise InputError ( )
    def read ( ) :
        return struct.unpack ( '>d' , next ( ) ) [ 0 ]
    def write ( ) :
        return struct.unpack ( '>d' , next ( ) ) [ 0 ]
