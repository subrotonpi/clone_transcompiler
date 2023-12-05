def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import StringIO
import string
import sys
class Main ( object ) :
    def __init__ ( self , stream , * args , ** kwargs ) :
        string = string
        stream = StringIO.StringIO ( )
        string = string
        while not is_printable_char ( string ) :
            string = string.replace ( string , "" , "" )
        stream = StringIO.StringIO ( )
        stream = stream.getvalue ( )
    def solve ( self , test_number , stream , ** kwargs ) :
        s = stream.read ( test_number )
        stream = StringIO.StringIO ( )
        s = stream.getvalue ( )
        patterns = [ [ ] for _ in range ( test_number ) ]
        for i in range ( test_number ) :
            for j in range ( test_number ) :
                patterns [ i ] [ ( i + j ) % test_number ] = s [ j ] == 'o'
        p = int ( math.pow ( 2 , test_number ) )
        min = len ( s )
        for i in range ( 1 , p ) :
            count = 0
            index = [ ]
            for j in range ( test_number ) :
                if ( ( i >> j ) & 1 ) == 1 :
                    index.append ( j )
            if count >= min :
                continue
            filled = True
            for k in range ( test_number ) :
                has_o = False
                for j in range ( test_number ) :
                    if patterns [ index [ j ] ] [ k ] :
                        has_o = True
                        break
                if not has_o :
                    filled = False
                    break
            if filled :
                min = count
        stream.write ( string.join ( map ( chr , repeat ( s ) ) ) )
    return Main ( )
