def _import ( ) :
    from itertools import repeat
    from .util import is_printable_char , read_bytes
    class Main ( object ) :
        def __init__ ( self ) :
            sc = FastScanner ( )
            N = sc.__next__ ( )
            A = [ ]
            for i in range ( N + 1 ) :
                A.append ( i )
        def __next__ ( self ) :
            if not self.next ( ) :
                raise StopIteration
            n = False
            if self.next ( ) == '-' :
                minus = True
            if self.next ( ) == '0' or self.next ( ) == '9' :
                raise StopIteration
            while True :
                if self.next ( ) == '0' :
                    n *= 10
                    n += self.next ( )
                elif self.next ( ) == - 1 or not is_printable_char ( self.next ( ) ) :
                    return int ( - n )
                else :
                    raise StopIteration
            b = read_bytes ( )
            for i in range ( 1 , N + 1 ) :
                h = self.higher ( A [ i ] )
                l = self.lower ( A [ i ] )
                A.append ( A [ i ] )
                ans += ( h - A [ i ] ) * ( l - i ) * i
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , buffer , ptr = 0 , buflen = 0 ) :
            self.buffer = buffer
            self.ptr = ptr
            self.buflen = buflen
        def __next__ ( self ) :
            if self.ptr < buflen :
                return True
            else :
                self.ptr = ptr
                try :
                    buflen = self.buffer.get ( self.ptr )
                except StopIteration :
                    pass
                if self.next ( ) == '-' :
                    minus = True
        def skip_unprintable ( self ) :
            while self.hasNext ( ) and not is_printable_char ( self.next ( ) ) :
                self.ptr += 1
        def __next__ ( self ) :
            if self.next ( ) == '-' :
                minus = True
            else :
                raise StopIteration
    return Main
