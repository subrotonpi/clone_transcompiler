def import import string , glob
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.readline ( ) )
        b = int ( sc.readline ( ) )
        cnt = 0
        for i in range ( a , b + 1 ) :
            s = str ( i )
            c = s.split ( )
            if c [ 0 ] == c [ 4 ] and c [ 1 ] == c [ 3 ] :
                cnt += 1
        print ( cnt )
