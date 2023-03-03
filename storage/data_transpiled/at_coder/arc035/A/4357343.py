def import import *
import sys
import string
import string
import sys
import string
import string
import sys
import string
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( )
        s = string.split ( args , " " )
        for i in range ( len ( s ) / 2 ) :
            if s [ i ] != s [ - 1 - i ] and s [ i ] != '*' and s [ - 1 - i ] != '*' :
                out.write ( "NO" )
                exit ( 0 )
        out.write ( "YES" )
