def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/test/self.txt' ) as sc :
            a = int ( sc.read ( ) )
            b = int ( sc.read ( ) )
            sc.close ( )
            print ( a + ( ( b - a ) * 2 ) )
