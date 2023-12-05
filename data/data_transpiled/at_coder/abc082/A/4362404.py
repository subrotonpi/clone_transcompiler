def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        ave = ( a + b ) / 2
        if ( a + b ) % 2 == 1 :
            ave += 1
        print ( ave )
