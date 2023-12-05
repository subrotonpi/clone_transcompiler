def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
    def main ( self ) :
        return Main ( self )
    def test ( self ) :
        return Main ( self )
    x = test ( )
    ans = 0
    if x < 4 :
        print ( 1 )
        return
    for i in range ( 2 , 40 ) :
        tmp = i
        cnt = 0
        while tmp <= x :
            tmp *= i
            cnt += 1
        if cnt >= 2 :
            ans = max ( ans , tmp // i )
    print ( ans )
