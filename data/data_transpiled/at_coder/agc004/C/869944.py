def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._fast_reader = _fast_reader ( )
        self._h = self._read_char ( )
        self._w = self._read_char ( )
    def read ( ) :
        if not self._fast_reader :
            raise StopIteration
        self._fast_reader.read = read_char ( )
        self._h = self._read_char ( )
        self._w = self._read_char ( )
        self._w = self._read_char ( )
    def read ( ) :
        if not self._fast_reader :
            raise StopIteration
        n = False
        if self._h < self._read_char ( ) :
            minus = True
        if self._h < self._read_char ( ) :
            raise StopIteration
        while True :
            if self._h <= self._read_char ( ) :
                n *= 10
            elif self._h == self._read_char ( ) :
                n += - n
            else :
                raise StopIteration
        self._h = self._read_char ( )
    def read ( ) :
        nl = self._read_char ( )
        if nl < self._nl or self._nl > self._nl :
            raise StopIteration
        return int ( nl )
    def write ( ) :
        if self._h < self._read_char ( ) :
            raise StopIteration
        if self._h > self._read_char ( ) :
            n = False
        if self._w < self._read_char ( ) :
            n *= 10
        elif self._w < self._read_char ( ) :
            n += - n
        elif self._w == self._read_char ( ) :
            n = False
        else :
            raise StopIteration
    def write ( ) :
        if self._h < self._read_char ( ) :
            n = True
        if self._h > self._read_char ( ) :
            n *= 10
        elif self._h > self._read_char ( ) :
            n += - n
        else :
            raise StopIteration
        