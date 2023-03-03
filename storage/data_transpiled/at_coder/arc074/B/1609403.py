def import _bisect
import bisect
import bisect
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.as = [ ]
        self.max_queue = [ ]
        self.min_queue = [ ]
    def read ( self ) :
        with open ( self.n ) as f :
            n = f.read ( )
            self.as = [ random.randint ( 0 , 3 * n ) for i in range ( self.n ) ]
    def solve ( self ) :
        self.max_queue = [ ]
        self.min_queue = [ bisect.bisect_left ( self.max_queue , self.min_queue ) ]
        self.maxs = [ ]
        self.mins = [ ]
        for i in range ( self.n ) :
            self.max_queue.append ( self.as [ i ] )
            self.maxs.append ( self.as [ i ] )
            self.min_queue.append ( self.as [ 3 * self.n - 1 - i ] )
            self.mins.append ( self.as [ 3 * self.n - 1 - i ] )
        for i in range ( self.n , 2 * self.n ) :
            self.max_queue.append ( self.as [ i ] )
            e = self.max_queue.pop ( )
            self.maxs [ i - n + 1 ] = self.maxs [ i - n ] + self.as [ i ] - e
        for i in range ( 2 * self.n - 1 , - 1 , - 1 ) :
            self.min_queue.append ( self.as [ i ] )
            e = self.min_queue.pop ( )
            self.mins [ i - n ] = self.mins [ i - n + 1 ] + self.as [ i ] - e
    ans = self.maxs [ 0 ] - self.mins [ 0 ]
    for i in range ( 0 , self.n ) :
        ans = max ( ans , self.maxs [ i ] - self.mins [ i ] )
    print ( ans )
