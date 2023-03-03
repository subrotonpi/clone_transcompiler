def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        S = sc.__next__ ( )
        T = sc.__next__ ( )
        g = gcd ( N , M )
        L = lcm ( N , M , g )
        intervalS = int ( L / M )
        intervalT = int ( L / N )
        for i in range ( g ) :
            if S [ intervalS * i ] != T [ intervalT * i ] :
                print ( - 1 )
                return
        print ( L )
    def lcm ( a , b , g ) :
        return a * b // g
    def gcd ( a , b ) :
        if not b :
            return a
        return gcd ( b , a % b )
