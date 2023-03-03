def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        k = sc.number
        gcd = abs ( k - sc.number )
        for i in range ( 1 , n ) :
            gcd = gcd ( gcd , abs ( k - sc.number ) )
        print ( gcd )
    def gcd ( a , b ) :
        return gcd ( b , a % b ) if b else a
    def lcm ( a , b ) :
        return a * b / gcd ( a , b )
