def import import _sys , _sys , _sys , _imp
from _sys import _sys , _imp
from _sys import _imp
try :
    sc = _sys
    s = _sys.stdin.read ( )
    cnt = 1
    ans = ""
    for i in range ( 1 , len ( s ) ) :
        if s [ i ] == s [ i - 1 ] :
            cnt += 1
        else :
            ans += str ( s [ i - 1 ] ) + str ( cnt )
            cnt = 1
        if i == len ( s ) - 1 :
            ans += str ( s [ i ] ) + str ( cnt )
    print ( ans )
    sc.close ( )
