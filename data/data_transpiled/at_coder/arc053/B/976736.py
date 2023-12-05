def import import string , math
import sys
import string
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        s = string.punctuation
        input = s.replace ( "" , "" )
        input = input.replace ( "" , "" )
        input = input.replace ( "" , "" )
        input = input.replace ( "" , "" )
        counter = [ 0 ] * 26
        for c in input :
            counter [ c - 'a' ] += 1
        odd = 0
        even_pairs = 0
        for i in range ( 26 ) :
            odd += ( counter [ i ] % 2 )
            even_pairs += ( counter [ i ] // 2 )
        if odd == 0 :
            print ( 2 * even_pairs )
        else :
            print ( 2 * ( even_pairs // odd ) + 1 )
