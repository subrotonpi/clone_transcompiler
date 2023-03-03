def _ _ main _ _ ( ) : return sys.stdin.read ( )
import re
import sys
import string
import string
import int
class Main ( object ) :
    def __init__ ( self , v ) :
        self.v = v
    def REPS ( self , l , r ) :
        return string.rpartition ( string.ascii_letters ) [ 0 ]
    def INS ( self , n ) :
        return REPS ( self , n ) [ 0 ]
    def get_int ( self ) :
        return int ( s.split ( ) [ 0 ] )
    def main ( self , $ ) :
        print ( REPS ( get_int ) ( s.split ( ) [ 0 ] ).map ( lambda o : re.sub ( '[^b-df-hj-np-tv-xz]' , '' , o.lower ( ) ).replace ( '[bc]' , '1' ).replace ( '[dw]' , '2' ).replace ( '[tj]' , '3' ).replace ( '[fq]' , '4' ).replace ( '[lv]' , '5' ).replace ( '[sx]' , '6' ).replace ( '[pm]' , '7' ).replace ( '[hk]' , '8' ).replace ( '[ng]' , '9' ).replace ( '[zr]' , '0' ) ).filter ( lambda o : o != '' ) )
