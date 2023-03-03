def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        num = 0
        array = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                array.append ( sc.choice ( string.ascii_lowercase + string.digits ) )
        array.reverse ( )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                sys.stdout.write ( array [ num ] )
                num += 1
                if j == 3 :
                    sys.stdout.write ( " " )
