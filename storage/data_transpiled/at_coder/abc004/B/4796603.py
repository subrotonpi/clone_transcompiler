def import string
import sys
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.Scanner ( string.punctuation )
        b = [ [ ] for i in range ( 3 , - 1 , - 1 ) ]
        for i in range ( 3 , - 1 , - 1 ) :
            for j in range ( 3 , - 1 , - 1 ) :
                b [ i ] [ j ] = sc.next ( ) [ 0 ]
        for i in range ( 4 ) :
            print ( string.join ( b [ i ] ) )
