def _import ( ) : return _fasta_read ( )
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._readline = sys.stdin.readline
    def readline ( self ) :
        self._readline = sys.stdin.readline
        A , B , C , K = struct.unpack ( '>i' , self._readline )
        S , T = struct.unpack ( '>i' , self._readline )
        ans = A * S + B * T
        if S + T >= K :
            ans -= ( S + T ) * C
        ans = max ( ans , 0 )
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self , size ) :
        self.stream.seek ( 0 )
        self._readline = None
    def has_next_byte ( self ) :
        if self._readline is None :
            return True
        else :
            self._readline = None
            try :
                self._readline.return_value = stream.read ( size )
            except AttributeError :
                pass
            if self._readline.return_value.startswith ( '-' ) :
                return False
        return True
    def read_byte ( self ) :
        if self._readline is None :
            return self._readline.return_value
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self._readline is not None :
            self._readline.return_value = stream.read ( self._readline.return_value )
    def next ( self ) :
        if not self._readline is None :
            raise StopIteration ( )
        yield ''
    def read ( self ) :
        self._readline = None
    def readline ( self ) :
        if self._readline is None :
            raise StopIteration ( )
        while self._readline is None :
            self._readline.return_value = stream.read ( self._readline.return_value )
        return self._readline
