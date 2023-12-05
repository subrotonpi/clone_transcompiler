def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        print ( ( a < b ) and 'LESS' or ( a > b ) and 'GREATER' or ( a < b ) and 'LESS' or ( a == b ) and 'EQUAL' or 'GREATER' )
