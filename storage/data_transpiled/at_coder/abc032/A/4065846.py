def import gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        n = sc.read ( )
        g = gcd ( a , b )
        x = a * b / g
        print ( ( n + x - 1 ) / x ** 2 )
    def gcd ( a , b ) :
        if b == 0 :
            return a
        else :
            return gcd ( b , a % b )
