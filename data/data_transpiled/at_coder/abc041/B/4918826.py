def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        mod = 1000000007
        print ( ( sc.read ( ) * sc.read ( ) % mod ) * sc.read ( ) % mod )
