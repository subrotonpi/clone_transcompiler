def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        for i in range ( 3 ) :
            s = sc.read ( ) [ 0 ]
            diff = ord ( 'a' ) - ord ( 'A' )
            print ( chr ( s - diff ) , end = ' ' )
