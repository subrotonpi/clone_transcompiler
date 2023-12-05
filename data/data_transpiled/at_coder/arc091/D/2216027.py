def _import ( ) : return next ( )
import sys
import termios
import sys
import struct
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.n = len ( self.stdin )
        self.xor = 0
        for i in range ( self.n ) :
            a , k = string.split ( self.stdin )
            xor ^= solve ( a , k )
        print ( 'Aoki' if xor == 0 else 'Takahashi' )
        self.stdout.flush ( )
    def solve ( a , k ) :
        if a < k :
            return 0
        if a % k == 0 :
            return a // k
        L = a // k + 1
        mod = a % k
        use = ( mod + L - 1 ) // L
        return solve ( a - use * L , k )
    def debug ( * o ) :
        sys.stderr.write ( string.join ( o ) + '\n' )
    class InputReader ( object ) :
        _BUFFER_LENGTH = 1 << 12
        def __init__ ( self , stream = sys.stdout ) :
            self.stream = stream
            self.buf = string.buffer ( self._buffer )
            self._buf = None
            self.num_chars = 0
        def read ( self ) :
            if self.num_chars == - 1 :
                raise InputError ( )
            if self._buf >= self.num_chars :
                self._buf = self._buf
            else :
                self._buf = self._buf
            if self._buf == '-' :
                self.sgn = - 1
                self._buf = self._buf
            return self.buf
        def write ( self , buf ) :
            self._buf = self._buf
            self._buf = self._buf
            self.sgn = 1
            self._buf = self._buf
            self.sgn = 0
            self._buf = self._buf
            self.sgn = 0
            self._buf = self._buf
    return Main ( )
