def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        ans = ""
        while True :
            if N % 2 == 0 :
                ans = "0" + ans
                N = ( N ) / - 2
            else :
                ans = "1" + ans
                N = ( N - 1 ) / - 2
            if N == 0 :
                print ( ans )
                break
