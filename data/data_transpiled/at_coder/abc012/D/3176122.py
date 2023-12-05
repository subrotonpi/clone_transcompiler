def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        d = [ { } for i in range ( 0 , N + 1 ) ]
        for a , b , t in zip ( a , b , t ) :
            d [ a ] [ b ] = t
            d [ b ] [ a ] = t
    ans = sys.maxsize
    for i in range ( 1 , N + 1 ) :
        ans = min ( ans , _Dijkstra ( i , d ) )
    print ( ans )
    def Dijkstra ( start , d ) :
        fixed = set ( )
        dist = [ 0 ] * N + [ start ]
        dist [ start ] = 0
        mc = _main._mk_comparator ( )
        pq = PriorityQueue ( 10 , mc )
        pq.append ( [ start , 0 ] )
        while pq :
            cur = pq.pop ( )
            now = cur [ 0 ]
            if now in fixed : continue
            fixed.add ( now )
            dist [ now ] = cur [ 1 ]
            for w in d [ now ].keys ( ) :
                if w not in fixed :
                    if dist [ w ] > dist [ now ] + d [ now ] [ w ] :
                        dist [ w ] = dist [ now ] + d [ now ] [ w ]
                        pq.append ( [ w , dist [ w ] ] )
    ans = sys.maxsize
    for i in range ( 1 , N + 1 ) :
        ans = max ( ans , dist [ i ] )
class MyComparator ( object ) :
    def __init__ ( self ) :
        self.my_comparator = MyComparator
