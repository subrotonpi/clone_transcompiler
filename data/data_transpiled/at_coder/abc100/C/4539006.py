def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        ans = 0
        for i in range ( N ) :
            a = sc.__next__ ( )
            if a % 2 :
                continue
            cnt = 0
            while a % 2 == 0 :
                a = a // 2
                cnt += 1
            ans += cnt
        print ( ans )
