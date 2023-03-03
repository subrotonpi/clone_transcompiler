def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.n = sc.n
    def main ( self ) :
        n = sc.n
        k = int ( math.sqrt ( 2 * n ) )
        while 1 :
            sum = ( 1 + k ) ** 2 / 2
            if sum < n :
                k += 1
            else :
                break
        print ( k )
