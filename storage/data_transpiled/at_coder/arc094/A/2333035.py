def _import ( ) : return next ( )
import sys
import termios
import sys
import struct
import termios
import sys
class Main ( termios.TextIOWrapper ) :
    def __init__ ( self ) :
        termios.tcsetattr ( sys.stdin , termios.TCSADRAIN , self._import_buffer )
        def __init__ ( self ) :
            termios.tcsetattr ( sys.stdout , termios.TCSADRAIN , self._import_buffer )
        def is_space ( self ) :
            c = next ( )
            while is_space ( c ) :
                c = next ( )
            return c
        def is_space ( self ) :
            return c == ' ' or c == '\r' or c == - 1
    def solve ( a , b , c ) :
        total = ( c - a ) / 2 + ( c - b ) / 2
        a += ( ( c - a ) / 2 ) * 2
        b += ( ( c - b ) / 2 ) * 2
        if a == c and b == c :
            return total
        elif a == c or b == c :
            return total + 2
        else :
            return total + 1
    def debug ( * o ) :
        print ( "".join ( o ) , file = sys.stderr )
    class Input :
        def __init__ ( self ) :
            self.BUFFER_LENGTH = 1 << 12
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = stream
        def read ( self , n ) :
            self.stream.seek ( 0 )
            if n == 0 :
                raise KeyboardInterrupt
            if n >= n :
                self.stream.seek ( 0 )
            return self.stream.read ( n )
        def readline ( self ) :
            c = self.stream.read ( n )
            if c == '-' :
                sgn = - 1
                c = next ( self.stream.read ( n ) )
            return self.stream.read ( n )
        def readline ( self ) :
            c = self.stream.read ( n )
            res = [ ]
            while not is_space ( c ) :
                res.append ( c )
                c = next ( self.stream.