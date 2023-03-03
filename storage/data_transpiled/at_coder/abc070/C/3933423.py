def import _gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        n = sc.readline ( ).strip ( )
        target = sc.readline ( )
        for i in range ( 1 , n ) :
            target = get ( target , sc.readline ( ).strip ( ) )
        print ( target )
    def get ( self , a , b ) :
        return a // gcd ( a , b ) * b
    def gcd ( self , a , b ) :
        x = a % b
        if x == 0 :
            return b
        else :
            return gcd ( b , x )
