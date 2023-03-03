def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , * args ) :
        return math.sin ( self.n )
    def __repr__ ( self ) :
        return "%s %s" % ( self.n , self.n )
    r = [ ]
    for i in range ( n ) :
        r.append ( i )
    r.sort ( )
    sum = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if i % 2 == ( n - 1 ) % 2 :
            sum += r [ i ] ** 2
        else :
            sum -= r [ i ] ** 2
    print ( sum * math.pi )
