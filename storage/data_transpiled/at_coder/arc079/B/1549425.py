def _import ( ) : return sys.stdin.read ( )
import termios
import sys
import struct
import string
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    def skip_while_space ( self ) :
        char = next ( self.stdin )
        if is_space ( char ) :
            return char
        else :
            return char
    def is_space ( self ) :
        return char in string.printable or char in string.printable or char in string.printable or char in string.printable
def is_space ( self ) :
    return char in string.printable
def debug ( * x ) :
    sys.stderr.write ( string.join ( x ) )
class InputReader ( object ) :
    _BUFFER_LENGTH = 1 << 12
    def __init__ ( self , stream = sys.stdout ) :
        self.stream = stream
    def read ( self , n ) :
        self.stream.read ( n )
        if n == 0 :
            raise InputError ( )
        if n >= 1 :
            self.stream.read ( n )
        return char
    def write ( self , n ) :
        self.stream.write ( n )
    def flush ( self ) :
        sys.stderr.write ( ''.join ( map ( str , x ) ) )
