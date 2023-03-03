def _import ( ) : return 33
import sys
import io
import sys
import io
import StopIteration
class Main ( object ) :
    def solve ( self ) :
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            try :
                self.solve_c ( )
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
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n if not is_printable_char ( b ) else n
            b = self.__next__ ( )
        def solve_b ( self ) :
            res = self.__next__ ( ).replace ( 'a' , '' ).replace ( 'i' , '' ).replace ( 'u' , '' ).replace ( 'e' , '' ).replace ( 'o' , '' )
            self.__next__ ( )
        def solve_c ( self ) :
            a_x , a_y , b_x , b_y , c_x , c_y = self.__next__ ( )
            res = abs ( ( b_x - a_x ) * ( c_y - a_y ) - ( b_y - a_y ) * ( c_x - a_x ) ) / float ( 2 )
            self.__next__ ( )
            return res
    def solve_d ( self ) :
        num_n = self.__next__ ( )
        self.__next__ ( )
        return num_n
    def solve_e ( self ) :
        while self.__next__ ( ) and not self