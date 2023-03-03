def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/n' , 'r' ) as sc :
            n = int ( sc.read ( ) )
            sc.close ( )
            print ( ( n * 800 ) - n / 15 * 200 )
