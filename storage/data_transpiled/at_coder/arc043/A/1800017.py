def import import sys , random
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.argv [ 1 ] )
        self.a = int ( sys.argv [ 2 ] )
        self.b = int ( sys.argv [ 3 ] )
        s = random.sample ( range ( n ) , 2 )
        s.sort ( )
        dis = s [ - 1 ] - s [ 0 ]
        sum = 0
        for i in s : sum += i
        avg = 1.0 * sum / n
        if not dis :
            print ( - 1 )
            return
        p = 1.0 * b / dis
        q = 1.0 * a - 1.0 * b * avg / dis
        print ( "%.10f" % p , end = " " , file = sys.stdout )
        print ( "%.10f" % q , end = " " , file = sys.stdout )
