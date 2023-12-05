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
        return int ( self._skip_unprintable )
    n = 0
    k = next ( self )
    f = [ ]
    for i in range ( 0 , n ) :
        for j in range ( 0 , k ) :
            f [ i ] [ j ] [ 0 ] = - 1
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if not is_printable_char ( b ) else n
        else :
            raise StopIteration
        b = next ( self )
    f.append ( dp ( 0 , k , 0 ) )
    print ( ''.join ( f ) )
def dp ( i , j , t ) :
    if f [ i ] [ j ] [ t ] >= 0 :
        return f [ i ] [ j ] [ t ]
    if i == n :
        if t == 1 :
            return 1.0
        else :
            return 0.0
    p = 1.0 / ( i + 1 )
    if j > 0 :
        ans = p * max ( dp ( i + 1 , j , 0 ) , dp ( i + 1 , j - 1 , 1 ) ) + ( 1 - p ) * dp ( i + 1 , j , t )
    else :
        ans = p * dp ( i + 1 , j , 0 ) + ( 1 - p ) * dp ( i + 1 , j , t )
    f [ i ] [ j ] [ t ] = ans
    return ans
class FastScanner ( object ) :
    def __init__ ( self ) :
        self._skip_unprintable = True
    def __next__ ( self ) :
        if ptr < len ( self._skip_unprintable ) :
            return True
        else :
            ptr = 0
            try :
                self._skip_unprintable = True
            except StopIteration :
                ptr += 1
            return ptr
        