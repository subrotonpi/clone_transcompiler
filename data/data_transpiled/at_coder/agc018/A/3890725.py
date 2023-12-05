def _import ( ) : return _import ( )
from struct import Struct , calcsize
from struct import Struct , calcsize
from struct import Struct
class Main ( Struct ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def read ( self ) :
        sc = Struct ( '' )
        N = sc.unpack ( '<' ) [ 0 ]
        K = sc.unpack ( '<' ) [ 0 ]
        A = [ ]
        M = 0
        for i in range ( N ) :
            A.append ( sc.unpack ( '<' ) [ 0 ] )
            M = max ( M , A [ i ] )
        G = _gcd ( A )
        if K <= M and K % G == 0 :
            print ( "POSSIBLE" )
        else :
            print ( "IMPOSSIBLE" )
    def gcd ( a , b ) :
        return b , a
    def gcd ( lst ) :
        if not lst :
            return - 1 , 0
        if len ( lst ) == 1 :
            return lst [ 0 ]
        result = lst [ 0 ]
        for i in lst [ 1 : ] :
            result = _gcd ( i , result )
        return result
    class FastScanner ( Struct ) :
        def __init__ ( self ) :
            Struct ( '' )
            self._read = Struct ( '' )
            self._ptr = 0
            self.buflen = 0
        def read ( self ) :
            self._read = Struct ( '' )
            self._buffer = [ ]
            self._ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if self._ptr < self.buflen :
                return True
            else :
                self._ptr = 0
                try : self._buffer.append ( self._read ( self._buffer ) )
                except AttributeError : pass
                if self.buflen <= 0 :
                    return False
            return True
        def __getitem__ ( self , i ) :
            if not self._pos :
                raise StopIteration
            else :
                return self._pos
    return Main ( )
