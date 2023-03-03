def import import sys
class Main ( object ) :
    def solve ( self ) :
        n = self.n
        if n == 0 :
            print ( 8 )
            return
        else :
            print ( 1 , end = ' ' )
            for i in range ( n - 1 ) :
                print ( 0 , end = ' ' )
            print ( 7 )
