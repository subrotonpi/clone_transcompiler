def _import ( ) : return sys.stdout.write
import io
import os
import sys
import struct
import sys
import os.environ
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._sys = sys
    def solve ( self ) :
        try :
            self._sys.stdout = io.StringIO ( )
        finally :
            if self._sys.stdout.isatty ( ) :
                self._sys.stdout.write ( self._sys.stdout.read ( ) )
            if self._sys.stdout.isatty ( ) :
                self._sys.stdout.flush ( )
    def __iter__ ( self ) :
        return iter ( self )
    def __next__ ( self ) :
        raise StopIteration
    def solve_a ( self ) :
        num_x = self._read_ord ( )
        b = self._read_ord ( )
    def __next__ ( self ) :
        if not self._sys.stdout.isatty ( ) :
            raise StopIteration
        if self._sys.stdout.isatty ( ) :
            return - n if not self._sys.stdout.isatty ( ) else n
        else :
            raise StopIteration
    def solve_b ( self ) :
        num_h = self._read_ord ( )
        num_w = self._read_ord ( )
        wk = [ [ 1 , 3 , 5 , 7 , 8 , 10 , 12 , 2 , 6 , 9 , 11 , 2 , 3 ] for i in range ( num_h ) ]
        for i in range ( num_h + 2 ) :
            yield wk [ i ]
    def solve_d ( self ) :
        num_n = self._read_ord ( )
        yield wk [ num_n ]
    def solve_f ( self ) :
        num_n = self._read_ord ( )
        yield wk [ num_n ]
