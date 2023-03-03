def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        ans = 0
        for c in s :
            if c == '+' : ans += 1
            else : ans -= 1
    def main ( self ) :
        return ans
