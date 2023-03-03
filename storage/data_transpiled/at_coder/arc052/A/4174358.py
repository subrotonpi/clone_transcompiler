def _import ( ) : return [ int ( x ) for x in range ( 10 ) ]
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _FastScanner ( )
        S = sc.next ( )
        for c in [ 'a' , 'z' ] :
            if c < '0' :
                raise ValueError
            while True :
                if '0' <= c <= '9' :
                    n *= 10
                    n += c - '0'
                elif not is_printable_char ( c ) :
                    return int ( - n ) if n else 0
                else :
                    raise ValueError
            b = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , * args ) :
            self.buffer = sys.stdin.read ( 1024 )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __len__ ( self ) :
            return len ( self.buffer )
return Main ( )
