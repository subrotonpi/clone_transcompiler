def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
        from sys import stdin
        if len ( self._import ) < int or self._import ( ) : raise ValueError
    def _float ( self ) :
        return float ( self._next )
    def _unpack ( self , data ) :
        R = [ ord ( data ) for _ in self._import ( ) ]
        R.sort ( )
        S = 0
        for i in range ( self._N ) :
            if self._N % 2 == ( i + 1 ) % 2 :
                S += R [ i ] * R [ i ]
            else :
                S -= R [ i ] * R [ i ]
        S *= math.pi
        print ( S )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 , 0 )
            self.stream.seek ( 0 , 2 )
        def has_next_byte ( self ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( self.stream.tell ( ) )
        def has_next_byte ( self ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( self.stream.tell ( ) )
                return False
        def is_printable_char ( self ) :
            return 33 <= self.stream.read ( self.stream.tell ( ) ) <= 126
        def __iter__ ( self ) :
            while self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                self.stream.seek ( self.stream.tell ( ) )
    def __next__ ( self ) :
        if self.stream.tell ( ) < self.stream.tell ( ) :
            return True
        else :
            return False
