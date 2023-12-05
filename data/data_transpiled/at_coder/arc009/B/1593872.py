def import import struct
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        b = [ ]
        for i in range ( 10 ) :
            b.append ( i )
        N = sc.count ( b )
        lst = [ sc.__next__ ( ) for _ in range ( N ) ]
        lst.sort ( lambda x , y : cmp ( f ( x , b ) , f ( y , b ) ) )
        for v in lst :
            print ( v )
    def f ( x , b ) :
        ret = 0
        s = str ( x ).decode ( 'utf-8' )
        for c in s :
            ret *= 10
            ret += b [ ord ( c ) - ord ( '0' ) ]
        return ret
