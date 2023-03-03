def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        ans = 0
        for i in range ( n ) :
            temp = sc.__next__ ( )
            while temp % 2 == 0 :
                temp /= 2
                ans += 1
        print ( ans )
