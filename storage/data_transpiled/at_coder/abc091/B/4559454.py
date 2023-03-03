def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        out = sys.stdout
        N = int ( sc.readline ( ) )
        s = [ sc.readline ( ) ]
        M = int ( sc.readline ( ) )
        t = [ sc.readline ( ) ]
        ans = 0
        for i in range ( N ) :
            cnt = 0
            for j in range ( N ) :
                if s [ i ] == s [ j ] :
                    cnt += 1
            for j in range ( M ) :
                if s [ i ] == t [ j ] :
                    cnt -= 1
            if cnt > 0 and cnt > ans :
                ans = cnt
        out.write ( ans )
        out.flush ( )
