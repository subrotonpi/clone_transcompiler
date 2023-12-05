def _import ( ) : return _import ( )
from itertools import repeat
from itertools import chain
from itertools import chain
from itertools import repeat
from itertools import chain
class Main ( object ) :
    @ staticmethod
    def __next__ ( self ) :
        if not self.next : raise StopIteration
        n = False
        b = self.next
        if b == '-' :
            minus = True
            b = self.next
        if b < '0' or b <= '9' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not is_printable_char ( b ) :
            return int ( minus ) - n
        else :
            raise StopIteration
        b = self.next
    def __next__ ( self ) :
        if not self.next : raise StopIteration
        n = False
        if b == '-' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( n ) - n
            else :
                raise StopIteration
        b = self.next
    def __next__ ( self ) :
        if self.next :
            return next ( self.next )
        else :
            return None
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
        def __next__ ( self ) :
            self.ptr = None
            self.buflen = None
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = None
                    try :
                        self.buflen = self.buflen
                    except AttributeError :
                        pass
                    if self.ptr <= 0 :
                        return False
                return True
        def __next__ ( self ) :
            if not self.next : raise StopIteration
            n = False
            b = self.next
            while self.next :
                yield b
                b = self.next
    return Main ( )
