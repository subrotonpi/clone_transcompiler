def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        out = sys.stdout
        N = int ( sc.readline ( ) )
        A = int ( sc.readline ( ) )
        B = int ( sc.readline ( ) )
        cnt = N * 100 + A * 10 + B
        if cnt % 4 == 0 :
            out.write ( "YES\n" )
        else :
            out.write ( "NO\n" )
        out.flush ( )
