def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/self/" ) as sc :
            a = sc.read ( )
            d = sc.read ( )
            print ( min ( a + 1 , d + 1 ) * max ( a , d ) )
