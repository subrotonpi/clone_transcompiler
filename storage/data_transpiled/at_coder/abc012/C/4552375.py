def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        ans = 2025
        ans -= self.sc.count ( )
        for i in range ( 1 , 9 ) :
            for j in range ( 1 , 9 ) :
                if i * j == ans :
                    print ( "%d x %d" % ( i , j ) )
