def import _gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = _raw_input ( )
        N = sc.__next__ ( )
        x = sc.__next__ ( )
        ds = [ abs ( sc.__next__ ( ) - x ) for x in range ( N ) ]
        ans = ds [ 0 ]
        for i in range ( N ) :
            ans = gcd ( ans , ds [ i ] )
        print ( ans )
    def gcd ( x , y ) :
        while 1 :
            tmp = x % y
            if tmp == 0 :
                return y
            x , y = y , tmp
