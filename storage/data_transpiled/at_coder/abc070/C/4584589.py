def import gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        tmp = sc.read ( )
        for i in range ( 1 , N ) :
            value = sc.read ( )
            gcd = gcd ( tmp , value )
            tmp = ( max ( value , tmp ) / gcd ) * min ( value , tmp )
        print ( tmp )
    def gcd ( a , b ) :
        return gcd ( b , a % b ) if b else a
