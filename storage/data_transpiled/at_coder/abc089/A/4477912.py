def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/n' ) as sc :
            n = int ( sc.read ( ) )
            sc.close ( )
        res = n / 3
        print ( res )
