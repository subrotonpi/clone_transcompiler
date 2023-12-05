def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __next__ ( self ) :
        self.raw_input = raw_input
    def __next__ ( self ) :
        return int ( self.raw_input )
    def nextDouble ( ) :
        return float ( next ( ) )
    def __next__ ( ) :
        return int ( next ( ) )
    def __next__ ( ) :
        return int ( next ( ) )
    def __next__ ( ) :
        for i in range ( N ) :
            L , R , T = __next__ ( )
            for j in range ( L , R + 1 ) :
                a [ j ] = T
        for aa in a :
            print ( aa )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.raw_input = raw_input
        def __next__ ( self ) :
            self.raw_input = raw_input
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.raw_input ( )
                except EOFError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __next__ ( self ) :
            while self.ptr < self.ptr + 1 and not isPrintableChar ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return True
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def __next__ ( ) :
        if self.ptr < self.buflen :
            return - 1
        else :
            raise StopIteration
    def __next__ ( ) :
        while True :
            if self.ptr < self.ptr + 1 :
                break
return Main ( )
