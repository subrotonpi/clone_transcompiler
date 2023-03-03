def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( '/proc/self/a' ) as sc :
            a , b , k = [ int ( i ) for i in sc.read ( ).split ( ) ]
            sc.close ( )
            for i in range ( a , a + k - 1 , b + 1 ) :
                print ( i )
                if i == a + k - 1 or i == b :
                    i += 1
                    for j in range ( max ( i , b - k + 1 ) , b + 1 ) :
                        print ( j )
