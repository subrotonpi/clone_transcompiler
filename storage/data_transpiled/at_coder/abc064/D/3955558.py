def import import sys , string , traceback , buf
from io import StringIO
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = len ( sc.readline ( ) )
        s = sc.readline ( ).split ( )
        res = list ( )
        right = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if s [ i ] == ')' :
                right += 1
            else :
                if right > 0 :
                    right -= 1
                else :
                    res.append ( ')' )
        res.append ( s [ i ] )
    ans = [ '(' ]
    for i in range ( right ) :
        ans.append ( buf.pop ( ) )
    print ( ''.join ( ans ) )
