def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        a = a.replace ( '' , '' )
        po = int ( a )
        print ( 'YES' if ( po % 4 == 0 ) else 'NO' )
