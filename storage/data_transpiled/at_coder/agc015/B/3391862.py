def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        s = sc.readline ( )
        a = [ ]
        ans = 0
        for i , c in enumerate ( s ) :
            if c == 'U' :
                ans += ( len ( s ) - i - 1 ) + i * 2
            else :
                ans += ( len ( s ) - i - 1 ) * 2 + i
        print ( ans )
