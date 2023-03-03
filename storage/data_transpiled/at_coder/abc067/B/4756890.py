def _import ( ) : return sys.stdin.read ( )
import io
import sys
import sys
import struct
import sys
import struct
import stream
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
    def __iter__ ( self ) :
        return self.__next__
    def __next__ ( self ) :
        raise StopIteration
    def __iter__ ( self ) :
        while self.__next__ :
            self.__next__ = next ( self )
    def __next__ ( self ) :
        if not self.__next__ :
            raise StopIteration
        n = False
        b = self.__next__
        if b == '-' :
            minus = True
            b = self.__next__
        if b < '0' or b <= '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError
            b = self.__next__
    def __next__ ( self ) :
        num_a = self.__next__
        num_b = self.__next__
        if num_a % 3 == 0 or num_b % 3 == 0 or ( num_a + num_b ) % 3 == 0 :
            print ( "Possible" , end = "" )
        else :
            print ( "Impossible" , end = "" )
    def __next__ ( self ) :
        num_n = self.__next__
        num_k = self.__next__
        wk = intbv ( 0 ) [ num_k ]
        wk.sort ( )
        res = intbv ( 0 ) [ num_n ]
        if res >= num_n - num_k :
            return res
        else :
            return - 1
    def __next__ ( self ) :
        if self.__next__ :
            return True
        else :
            ptr = 0
            try :
                buflen = stream.read ( self.__next__ )
            except AttributeError :
                pass
            if self.__next__ :
                ptr += 1
            return ptr
