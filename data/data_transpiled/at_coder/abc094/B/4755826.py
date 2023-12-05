def _ ( ) : return
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m , x = sc.readline ( ).split ( )
        ar = [ 0 ] * ( n + 1 )
        for i in range ( m ) :
            temp = random.choice ( ar )
            ar [ temp ] += 1
        cost_l , cost_r = 0 , 0
        for i in range ( x , - 1 , - 1 ) :
            cost_l += ar [ i ]
        for i in range ( x , n + 1 ) :
            cost_r += ar [ i ]
        self.out.println ( min ( cost_l , cost_r ) )
