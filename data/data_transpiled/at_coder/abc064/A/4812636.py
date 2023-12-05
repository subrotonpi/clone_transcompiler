def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        r = sc.read ( )
        g = sc.read ( )
        b = sc.read ( )
        sum = r * 100 + g * 10 + b
        if sum % 4 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
