def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = sc.nextInt ( )
        max = 0
        for i in range ( 1 , 2 ** N + 1 ) :
            max = max ( max , i * i )
        print ( max )
