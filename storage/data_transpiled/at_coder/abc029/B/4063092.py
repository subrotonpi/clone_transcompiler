def _import ( ) : return int ( nl )
class Main ( ) :
    def sum_length_of_digit_number ( self ) : return float ( next ( ) )
    def digit10 ( self ) : return float ( next ( ) )
    def main ( self ) :
        sc = FastScanner ( self )
        num = 0
        for i in range ( 12 ) :
            s = sc.next ( )
            if s.find ( 'r' ) != - 1 :
                num += 1
        print ( num )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 , os.SEEK_SET )
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = stream.read ( self.ptr )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < self.ptr :
            yield self.ptr
        return self.stream.read ( self.ptr )
    def next ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        s = [ ]
        b = self.stream.read ( 1 )
        while self.stream.read ( b ) == '-' :
            s.append ( b )
            b = self.stream.read ( 1 )
        return s
    def __next__ ( self ) :
        if self.stream.read ( 1 ) == '' :
            return - 1
        else :
            raise StopIteration
    def __next__ ( self ) :
        nl = next ( )
        if b == '-' :
            minus = True
            b = self.stream.read ( 1 )
        if b < '0' or b > '9' :
            raise StopIteration
        while True :
            if b == '' or b == '-' :