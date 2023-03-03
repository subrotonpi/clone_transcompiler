def import _main
class B ( object ) :
    def __init__ ( self , spend ) :
        self.spend = spend
    def spend ( self ) :
        while spend > 0 :
            X = self.Q.get ( )
            amt = min ( spend , X [ 1 ] )
            print ( spend , X [ 0 ] , X [ 1 ] )
            spend -= amt
            self.ans += X [ 0 ] * amt
            if X [ 1 ] - amt > 0 :
                self.Q.put ( ( X [ 0 ] , X [ 1 ] - amt ) )
    def main ( ) :
        with open ( "/proc/sys/stdin" , "r" ) as f :
            T = int ( f.read ( ) )
            for cas in range ( 1 , T + 1 ) :
                E , R , n = f.read ( )
                Q = PriorityQueue ( 10 , key = lambda A , B : A [ 0 ] , value = A [ 1 ] , value = B [ 0 ] )
                for i in range ( n ) :
                    Q.put ( ( f.read ( ) , i ) )
    ans = 0
    M = defaultdict ( int )
    M [ 0 ] = E
    M [ 2 * ( n - 1 ) + 1 ] = None
    for i in range ( n ) :
        X = Q.get ( )
        v = X [ 0 ]
        t = int ( X [ 1 ] )
        A , B = M.floorkey ( 2 * t )
        have_i = min ( E , M [ A ] + R * ( t - A / 2 ) )
        need_i = max ( 0 , M [ B ] - R * ( B / 2 - t ) )
        ans += ( have_i - need_i ) * v
        M [ 2 * t ] = have_i
        M [ 2 * t + 1 ] = need_i
    print ( "Case #%d: %d\n" % ( cas , ans ) )
