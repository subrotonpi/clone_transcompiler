def _ ( s ) : return s
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string.split ( s )
        self.g_int = int ( self.s )
        self.g_long = long ( self.s )
    def main ( self ) :
        c = s.split ( )
        n = len ( c )
        rem = [ ]
        res , rem_ = 0 , 0
        for i in range ( n ) :
            if c [ i ] == 'g' :
                rem_ += 1
            else :
                if rem_ > 0 :
                    rem_ -= 1
                else :
                    res += 1
            rem.append ( rem_ )
        print ( res , rem [ - 1 ] / 2 )
