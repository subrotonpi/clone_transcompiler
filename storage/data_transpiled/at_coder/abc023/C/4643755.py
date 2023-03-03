def _import ( ) : return sys.stdin.read ( 1024 )
import struct
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self._reader = FastScanner ( )
        R = struct.unpack ( '>H' , self.read ( 1 ) ) [ 0 ]
        C = struct.unpack ( '>H' , self.read ( 1 ) ) [ 0 ]
        k = struct.unpack ( '>H' , self.read ( 1 ) ) [ 0 ]
        n = struct.unpack ( '>H' , self.read ( 1 ) ) [ 0 ]
        r = [ ]
        c = [ ]
        def read ( self ) :
            if self._reader.peek ( ) == '-' :
                minus = True
                b = self.read ( 1 )
            if self._reader.peek ( ) == '-' :
                raise ValueError
            while self._reader.peek ( ) == '' :
                n *= 10
                n += self._reader.peek ( )
            elif self._reader.peek ( ) == '' :
                n += self._reader.peek ( )
        def read ( self ) :
            if self._reader.peek ( ) == '' :
                raise ValueError
            while self._reader.peek ( ) == '' :
                n += self._reader.peek ( )
        def write ( self , data ) :
            if self._reader.peek ( ) == '' :
                return data
        def read ( self ) :
            return self._reader.peek ( )
    def read ( self ) :
        nl = random.randint ( 1 , 32 )
        if self._reader.peek ( ) == '' or self._reader.peek ( ) == '' :
            raise ValueError
        while self._reader.peek ( ) == '' :
            n += self._reader.peek ( )
        return ''.join ( [ chr ( i ) for i in range ( n ) ] )
