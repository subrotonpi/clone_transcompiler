def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
class Main ( object ) :
    def solve ( self ) :
        def __next__ ( self ) :
            return int ( self.__next__ ( ) )
        def __next__ ( self ) :
            try :
                self.__next__ ( )
            finally :
                if self.__next__ ( ) :
                    self.__next__ ( )
        def __next__ ( self ) :
            raise StopIteration
        def __next__ ( self ) :
            b = self.__next__ ( )
            while self.__next__ ( ) :
                self.__next__ ( )
            return b
        def __next__ ( self ) :
            if not self.__next__ ( ) :
                raise StopIteration
            n = False
            if self.__next__ ( ) :
                minus = True
                b = self.__next__ ( )
            if b < '0' or self.__next__ ( ) :
                raise StopIteration
            while True :
                if self.__next__ ( ) <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif self.__next__ ( ) == - 1 or not self.__next__ ( ) :
                    return - n if n else n
            else :
                raise StopIteration
    def __next__ ( self ) :
        num_w = self.__next__ ( )
        num_a = self.__next__ ( )
        num_b = self.__next__ ( )
        res = 0
        if self.__next__ ( ) + num_a < num_b :
            res = abs ( num_b - ( num_a + num_w ) )
        elif self.__next__ ( ) + num_b < num_a :
            res = abs ( num_a - ( num_b + num_w ) )
        print ( res )
    def __next__ ( self ) :
        num_n = self.__next__ ( )
        self.__next__ ( )
        return
    def __next__ ( self ) :
        while self.__next__ ( ) :
            ptr += 1
        return ptr
