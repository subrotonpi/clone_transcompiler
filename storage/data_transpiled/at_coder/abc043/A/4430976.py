def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/n' ) as sc :
            n = int ( sc.read ( ) )
            res = 0
            for i in range ( 1 , n + 1 ) :
                res += i
            print ( res )
