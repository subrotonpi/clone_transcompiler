def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.read ( )
        print ( ( n % 2 == 0 ) and n / 2 or ( n / 2 ) + 1 )
