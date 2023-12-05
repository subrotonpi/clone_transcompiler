def _import ( ) : return _import ( )
class Main ( ) :
    def sum_length_of_digit_number ( self ) :
        self._import ( )
        self._import ( )
        self._import ( )
        self._import ( )
    def next ( self ) :
        self._import ( )
        self._import ( )
        return next ( )
    def read ( self ) :
        self._import ( )
        S = self._next ( )
        num = [ ]
        for i , c in enumerate ( S ) :
            num.append ( c - 'A' )
            self._import ( )
            self._num += 1
        for i in range ( 6 ) :
            print ( num [ i ] , end = ' ' )
            if i != 5 :
                print ( ' ' , end = ' ' )
            else :
                print ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream = stream
        def has_next_byte ( self ) :
            if self._ptr < self._buflen :
                return True
            else :
                self._ptr = 0
                try :
                    self._buffer = stream.read ( self._ptr )
                except AttributeError :
                    pass
                if self._buffer [ 0 ] <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self._ptr < self._ptr :
                return self._buffer [ 0 ]
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self._ptr < self._ptr and not isPrintableChar ( self._buffer [ 0 ] ) :
                self._buffer [ 0 ] += 1
            return True
        def next ( self ) :
            if self._ptr < self._ptr :
                raise StopIteration
            s = [ ]
            b = self._ptr
            while self._ptr < self._ptr :
                s.append ( b )
                b = self._ptr