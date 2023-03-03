def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/test/self/test/self.txt' ) as sc :
            n , k = [ int ( i ) for i in sc.read ( ).split ( ) ]
            sc.close ( )
            num = 1
            for i in range ( n ) :
                num += min ( num , k )
            print ( num )
