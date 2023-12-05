def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        ans = "Positive"
        if a <= 0 and b >= 0 :
            ans = "Zero"
        if b < 0 and ( b - a + 1 ) % 2 == 1 :
            ans = "Negative"
        print ( ans )
