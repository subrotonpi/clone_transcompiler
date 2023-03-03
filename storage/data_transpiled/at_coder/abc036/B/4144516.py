def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __next__ ( self ) :
            sc = stream.read ( 1 )
            N = sc.tell ( )
            table = [ ]
            for i in range ( N ) :
                S = sc.next ( )
                for j in range ( N ) :
                    table.append ( S [ j ] )
            for i in range ( N ) :
                for j in range ( N ) :
                    print ( table [ N - j - 1 ] [ i ] , end = ' ' )
                print ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
        def read ( self ) :
            if self.stream.read ( 1 ) < 0 :
                return stream.read ( )
            else :
                self.stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < 0 :
                return True
            else :
                self.stream.seek ( 0 )
                return False
        def next_byte ( self ) :
            if self.stream.read ( 1 ) < 0 :
                return self.stream.read ( 1 )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) < 0 :
                if self.stream.read ( 1 ) < 0 :
                    return False
                else :
                    return True
        def next ( self ) :
            if self.stream.read ( 1 ) < 0 :
                return self.stream.read ( 1 )
            else :
                return self.stream.read ( 1 )
        def __next__ ( self ) :
            if self.stream.read ( 1 ) < 0 :
                return False
            else :
                return True
    return Main ( )
