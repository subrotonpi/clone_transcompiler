def _import ( ) : return sys.stdin
import struct
import struct
import sys
class Main ( ) :
    def solve ( ) :
        n = randint ( 0 , 256 )
        h = n // 3600
        n %= 3600
        m = n // 60
        n %= 60
        s = n
        out.write ( '%02d:%02d:%02d' % ( h , m , s ) )
    def read ( ) :
        if not isinstance ( n , int ) :
            raise ValueError
        n = 0
        while is_printable ( n ) :
            if '0' <= n <= ord ( 'a' ) :
                n *= 10
                n += ord ( 'a' )
        return n if n == ord ( 'a' ) else n
    def write ( ) :
        ar = [ ]
        for i in range ( 1 , n ) :
            ar.append ( next ( ) )
        return ar
    def write ( ) :
        if not isinstance ( n , int ) :
            raise ValueError
        n = n
        while is_printable ( n ) :
            n += 1
        return n if n == ord ( 'a' ) else n
    def write ( ) :
        ar = [ ]
        for i in range ( 1 , n ) :
            ar.append ( next ( ) )
        return ''.join ( ar )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
    def write ( ) :
        return ''.join ( [ chr ( i ) for i in range ( 1 , n ) ] )
