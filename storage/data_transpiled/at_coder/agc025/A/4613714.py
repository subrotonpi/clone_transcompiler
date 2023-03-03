def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        st = sc.readline ( )
        ans = 0
        for i in st :
            ans += i - '0'
        print ( 10 if ans == 1 else ans )
