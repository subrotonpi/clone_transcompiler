def import _reader
import sys
import csv
class Main ( csv.reader ) :
    def __init__ ( self , reader ) :
        with CustomReader ( ) as f :
            csv.reader.next ( )
    def execute ( self , reader ) :
        ( S , T ) = reader.next ( )
        candidates = [ ]
        for i , bound in enumerate ( range ( len ( S ) - len ( T ) ) ) :
            if match ( S , T , i ) :
                key = S [ : i ].replace ( '?' , 'a' ) + T + S [ i + len ( T ) : ].replace ( '?' , 'a' )
                candidates.append ( key )
        candidates.sort ( )
        print ( candidates [ 0 ] if candidates else 'UNRESTORABLE' )
    def match ( s , t , pos ) :
        for i , c in enumerate ( t ) :
            if s [ pos + i ] == '?' :
                continue
            if s [ pos + i ] == t [ i ] :
                continue
            return False
        return True
    class CustomReader ( csv.reader ) :
        DEFAULT_BUF_SIZE = 2048
        def __init__ ( self , reader ) :
            self.reader = reader
        def readline_as_int ( self ) :
            str_array = self.reader.next ( ).split ( )
            int_array = [ ]
            for i , n in enumerate ( str_array ) :
                int_array.append ( int ( n ) )
            return int_array
        def readline_as_int_matrix ( self , rows , columns ) :
            matrix = [ ]
            for i , r in enumerate ( self.reader ) :
                for j in range ( len ( r ) ) :
                    matrix.append ( [ ] )
            return matrix
return Main
