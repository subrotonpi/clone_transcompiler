def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/status' ) as sc :
            S = sc.read ( )
            sc.close ( )
            if S [ - 1 ] == 'T' :
                print ( 'YES' )
            else :
                print ( 'NO' )
