def _import ( ) : return _import ( "" , "" , "" , "" , "" )
class Main ( object ) :
    def __init__ ( self ) :
        self._fastscan = FastScanner ( )
        self.N = self._fastscan.__next__ ( )
        S = [ ]
        for i in range ( self.N ) :
            S.append ( "" )
        self.T = self.next ( )
        st = [ ]
        for j in range ( len ( T ) ) :
            st.append ( T [ j ] )
        while not st.empty ( ) :
            S [ - n ] += st.pop ( )
    self.S = [ ]
    self.U = [ ]
    for i in range ( self.N ) :
        U.append ( "" )
        st = [ ]
        for j in range ( len ( S [ i ] ) ) :
            st.append ( S [ i ] )
        while not st.empty ( ) :
            U [ i ] += st.pop ( )
        print ( U [ i ] )
class FastScanner ( object ) :
    def __init__ ( self , stream = sys.stdin ) :
        self.stream = stream
        self.stream = sys.stdin
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = stream.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def next ( self ) :
            if not self.stream :
                raise StopIteration
            self.stream.write ( b"" )
    def is_printable_char ( self ) :
        return 33 <= self.stream.getvalue ( )
    def skip_unprintable ( self ) :
        while self.stream and not self.stream :
            self.stream.write ( b"" )
