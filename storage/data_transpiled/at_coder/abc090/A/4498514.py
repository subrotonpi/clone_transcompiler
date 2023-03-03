def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        with open ( "/etc/init.d/" , "r" ) as sc :
            for i in range ( 3 ) :
                S = sc.read ( )
                sys.stdout.write ( S [ i ] )
        print ( )
        sc.close ( )
