def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 ) * sc.randint ( 0 , 100 )
        a *= sc.randint ( 0 , 100 )
        print ( ( 'DRAW' if a == b else 'TAKAHASHI' if a < b else 'AOKI' ) )
