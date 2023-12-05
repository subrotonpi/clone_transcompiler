def import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).split ( '' )
        for i in range ( len ( n ) ) :
            if n [ i ] == '1' :
                n [ i ] = '9'
                continue
            if n [ i ] == '9' :
                n [ i ] = '1'
        sj = string.join ( n , '' )
        print ( sj )
