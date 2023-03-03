def _import ( ) : return _import ( IO )
class Main ( IO ) :
    def __init__ ( self ) :
        IO.__init__ ( self )
        self.io = IO ( )
    def close ( self ) :
        try :
            self.io.close ( )
        except KeyboardInterrupt :
            pass
    def read ( ) :
        try :
            self.io.read ( )
        except KeyboardInterrupt :
            pass
        else :
            return
    def write ( ) :
        try :
            self.io.write ( b'' )
        except KeyboardInterrupt :
            pass
        else :
            return
    def write ( ) :
        S = 0
        for i in range ( n ) :
            if c [ i ] % c [ i ] == 0 :
                S += 1
            if len ( S ) % 2 == 1 :
                ans += 0.5
            else :
                ans += float ( S + 2 ) / ( 2 * S + 2 )
        print ( ans )
    class IO ( object ) :
        def __init__ ( self , stream = sys.stdout ) :
            self.stream = stream
        def write ( self , source ) :
            self.stream.write ( source )
            self.stream.write ( source )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.write ( b'' )
        def write ( self , source ) :
            self.stream.write ( source )
            self.stream.write ( source )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.write ( b'' )
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                self.stream.write ( b'' )
    read ( )
