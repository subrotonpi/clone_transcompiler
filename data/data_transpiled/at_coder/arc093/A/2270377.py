def _import ( ) : return sys.stdin.read ( )
import termios
import sys
import struct
import string
import sys
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.skipWhileSpace ( )
    def read ( self ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def write ( self , a ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def isSpaceChar ( self ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def read ( self ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def isSpaceChar ( self ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def read ( self ) :
        return string.atoi ( self.stdin.read ( 1 ) )
    def isSpaceChar ( self ) :
        return string.isdigit ( self.stdin.read ( 1 ) )
    def debug ( * o ) :
        sys.stderr.write ( ''.join ( str ( o ) for o in o ) )
    class InputReader ( object ) :
        _BUFFER_LENGTH = 1 << 12
        def __init__ ( self , stream = sys.stdout ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
            self.buf = ''
            self.pos = self.stream.tell ( )
            self.char = self.stream.read ( 1 )
            self.pos = self.stream.tell ( )
            self.char = self.stream.read ( 1 )
            self.char = self.stream.read ( 1 )
            self.char = self.char
        def read ( self ) :
            return string.atoi ( self.stdin.read ( 1 ) )
        def isSpaceChar ( self ) :
            return string.atoi ( self.stdin.read ( 1 ) )
    return Main ( )
