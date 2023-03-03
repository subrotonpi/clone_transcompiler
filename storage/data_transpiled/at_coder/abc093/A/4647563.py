def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        with open ( '/etc/init.d/' , 'r' ) as sc :
            C = sc.read ( ).split ( )
            sc.close ( )
            if C [ 0 ] != C [ 1 ] and C [ 0 ] != C [ 2 ] and C [ 1 ] != C [ 2 ] :
                print ( 'Yes' )
            else :
                print ( 'No' )
