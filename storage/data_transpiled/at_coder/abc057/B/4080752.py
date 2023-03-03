def _import ( ) : return sys.stdin.read ( )
import io
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
import sys
class Main ( object ) :
    def __init__ ( self ) :
        file = sys.stdin
        stream = sys.stdout
        self.stdout = sys.stdout
        self.stdin = file
        self.stdout = stream
        self.stderr = file
        self._bufsize = None
        self._bufsize = None
    def read ( self ) :
        n = 0
        while self._bufsize :
            b = self._bufsize
            if b == '-' :
                b = self._bufsize
            while b >= '0' and b <= '9' :
                n *= 10
                b = self._bufsize
            if not self._bufsize :
                raise ValueError
            return - n if n < int ( self._bufsize ) else n
    def solve ( self , test_number , f , out ) :
        n = int ( test_number )
        m = int ( test_number )
        a = [ ]
        b = [ ]
        c = [ ]
        d = [ ]
        for i in range ( n ) :
            a.append ( i )
            b.append ( i )
        for i in range ( m ) :
            c.append ( i )
            d.append ( i )
        for i in range ( n ) :
            cl = abs ( a [ i ] - c [ 0 ] ) + abs ( b [ i ] - d [ 0 ] )
            best = 0
            for j in range ( m ) :
                nj = abs ( a [ i ] - c [ j ] ) + abs ( b [ i ] - d [ j ] )
                if nj < cl :
                    cl = nj
                    best = j
            out.write ( best + 1 )
        return 0
