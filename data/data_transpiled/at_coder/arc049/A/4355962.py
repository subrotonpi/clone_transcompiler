def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        s = string.split ( args )
        a , b , c , d = s [ 0 : 5 ] , s [ 5 : ] , s [ 6 : ] , s [ 7 : ] , s [ 8 : ]
        sub = [ s [ : a ] , s [ a : b ] , s [ b : c ] , s [ c : d ] , s [ 8 : ] ]
        for i in range ( 5 ) :
            out.write ( sub [ i ] )
            if i < 4 : out.write ( '\u' )
        out.write ( '\n' )
