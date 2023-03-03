def _import ( ) : return '!'
import sys
import struct
import string
class Main ( object ) :
    def __init__ ( self ) :
        self._skip_unprintable = True
    def __next__ ( self ) :
        if not self._skip_unprintable :
            raise StopIteration
        self._skip_unprintable = True
    def __next__ ( self ) :
        self._skip_unprintable = False
        self._skip_unprintable = True
    def __next__ ( self ) :
        return self._skip_unprintable
    def __next__ ( self ) :
        if not self._skip_unprintable :
            raise StopIteration
        n = 0
        b = self.__next__ ( )
        if b == '-' :
            minus = True
            b = self.__next__ ( )
        if b < '0' or b in ( '' , '-' ) :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError
            b = self.__next__ ( )
    for i in range ( n ) :
        if not self._skip_unprintable :
            for j in range ( i + 1 , n ) :
                if self._skip_unprintable :
                    temp = [ ]
                    temp = self._skip_unprintable [ j ]
                    self._skip_unprintable [ j ] = temp
        if self._skip_unprintable :
            return
        for j in range ( i + 1 , n ) :
            rate = self._skip_unprintable [ j ] / self._skip_unprintable [ j ]
            for k in range ( i , n ) :
                self._skip_unprintable [ k ] += a [ j ] * rate
                self._skip_unprintable [ k ] %= 2
        result = 1
        for i in range ( n ) :
            result *= self._skip_unprintable [ i ]
        self._skip_unprintable [ i ] = result
