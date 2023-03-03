def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
        def read ( self ) :
            sc = stream.read ( self.stream.fileno ( ) )
            x = sc.unpack ( '<' + '0' * 10 ) [ 0 ]
            y = sc.unpack ( '<' + '0' * 10 ) [ 0 ]
            k = sc.unpack ( '<' + '0' * 10 ) [ 0 ]
            if y >= k :
                print ( x + k )
            else :
                raise ValueError ( )
            b = read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError ( )
            while True :
                if b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return int ( n )
                else :
                    raise ValueError ( )
            return b
        def read ( self ) :
            if self.stream.read ( self.stream.fileno ( ) ) < self.stream.tell ( ) :
                return self.stream.read ( self.stream.tell ( ) )
            else :
                return None
        def startswith ( self ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                return self.stream.read ( self.stream.tell ( ) )
            else :
                return None
        def startswith ( self ) :
            return self.stream.read ( self.stream.tell ( ) )
        def startswith ( self ) :
            return self.stream.startswith ( '-' )
    return Main ( )
