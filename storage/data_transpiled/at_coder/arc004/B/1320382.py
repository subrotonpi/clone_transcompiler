def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( "/proc/self/test" , "r" ) as sc :
            n = sc.read ( )
            max = 0
            sum = 0
            for i in range ( n ) :
                dis = sc.read ( )
                max = max ( max , dis )
                sum += dis
            print ( sum )
            print ( max ( 0 , 2 * max - sum ) )
