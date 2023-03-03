def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
    def start ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
    lset = PriorityQueue ( key = lambda l1 : - cmp ( l1 , l2 ) )
    lset.add ( long ( self.x ) )
    ladd = 0
    rset = PriorityQueue ( key = lambda x : x [ 0 ] )
    radd = 0
    min = 0
    for i in range ( 1 , N ) :
        ladd -= a [ i ]
        radd += a [ i - 1 ]
        if x [ i ] < lset.peek ( ) + ladd :
            min = min + ( lset.peek ( ) + ladd - x [ i ] )
            lset.add ( x [ i ] - ladd )
            lset.add ( x [ i ] - ladd )
            rset.add ( lset.poll ( ) + ladd - radd )
        elif rset.peek ( ) + radd < x [ i ] :
            min = min + ( x [ i ] - ( rset.peek ( ) + radd ) )
            rset.add ( x [ i ] - radd )
            rset.add ( x [ i ] - radd )
            lset.add ( rset.poll ( ) + radd - ladd )
        else :
            lset.add ( x [ i ] - ladd )
            rset.add ( x [ i ] - radd )
    print ( min )
