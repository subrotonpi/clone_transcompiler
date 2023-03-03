def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream._fast_reader = stream
            A = stream.read ( 1 )
            B = stream.read ( 1 )
            max_a = max ( A % 100 + 900 , A - ( ( A // 10 ) % 10 ) * 10 + 90 )
            max_a = max ( max_a , A - ( A % 10 ) + 9 )
            min_b = min ( B % 100 + 100 , B - ( ( B // 10 ) % 10 ) * 10 )
            min_b = min ( min_b , B - ( B % 10 ) )
            print ( max ( max_a - B , A - min_b ) )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream._buffer = stream
        def read ( self ) :
            if not stream._buffer :
                raise EOFError ( )
            while stream._buffer :
                if stream._buffer.count ( ) == 0 :
                    stream._buffer.pop ( )
                else :
                    stream._buffer.pop ( )
        def has_next_byte ( self ) :
            if self._zero_byte ( ) :
                return True
            else :
                self._zero_byte = self._zero_byte
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self._zero_byte ( ) and not is_printable_char ( self._buffer [ ptr ] ) :
                self._zero_byte += 1
        def __iter__ ( self ) :
            return iter ( self._buffer )
        def next ( self ) :
            if not self._zero_byte ( ) :
                stream._buffer.pop ( )
            else :
                stream._buffer.pop ( )
    return Main ( )
