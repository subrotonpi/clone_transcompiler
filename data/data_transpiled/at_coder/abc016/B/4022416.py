def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.next = stream.next
        def read ( self ) :
            if not stream.isatty ( ) :
                stream.next = stream.next
            A = ord ( A )
            B = ord ( B )
            C = ord ( C )
            if B == 0 and A == '9' :
                stream.next = stream.next
            while True :
                if '0' <= A <= '9' :
                    stream.next = stream.next
                elif '?' in B or not is_printable_char ( B ) :
                    return int ( - n )
                else :
                    stream.next = stream.next
        def write ( self , data ) :
            if self.ptr < self.ptr :
                return data
            else :
                self.ptr = 0
                try :
                    buflen = stream.next
                except StopIteration :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.ptr < self.ptr :
                return data [ self.ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.ptr and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
            if not self.ptr :
                stream.next = stream.next
            else :
                stream.next = stream.next
    return Main ( )
