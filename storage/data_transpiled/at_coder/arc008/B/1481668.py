def _ ( ) : return ''
import sys
import string
import string
import int
class Main ( object ) :
    def __init__ ( self , v ) :
        self.v = int ( v )
    def REPS ( self , l , r ) :
        return string.rpartition ( string.ascii_lowercase ) [ l : r ]
    def INS ( self , n ) :
        return REPS ( self , n ).map ( int )
    def get_int ( self ) :
        return int ( self.s.get ( '' ) )
    def main ( self , $ ) :
        n , m = get_int ( ) , get_int ( )
        c , k = [ 0 ] * 26 , [ 0 ] * 26
        s.next ( ).chars.update ( { 1 : c [ i - 'A' ] } )
        s.next ( ).chars.update ( { 1 : k [ i - 'A' ] } )
        if REPS ( 26 ).any ( c [ i ] > 0 and k [ i ] == 0 ) :
            print ( - 1 )
            return
        print ( REPS ( 26 ).filter ( lambda i : c [ i ] != 0 , ( c [ i ] + k [ i ] - 1 ) // k [ i ] ).max ( ).astype ( int ) )
