def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = object.getVar ( 'sc' )
        n = sc.eval ( )
        p = sc.eval ( )
        self.containOdd = False
        for i in range ( n ) :
            if sc.eval ( ) % 2 != 0 :
                self.containOdd = True
        if self.containOdd == False :
            if p == 0 :
                print ( long ( math.pow ( 2 , n ) ) )
            else :
                print ( 0 )
        else :
            print ( long ( math.pow ( 2 , n - 1 ) ) )
