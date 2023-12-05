def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        bias = 100
        A = sc.__next__ ( )
        B = sc.__next__ ( )
        if A == B :
            print ( 0 )
            sys.exit ( 0 )
    fixed = set ( )
    dic = ( 1 , 5 , 10 , - 1 , - 5 , - 10 )
    B = abs ( B - A ) + bias
    dist = [ ]
    dist.append ( int ( B ) )
    dist.append ( bias )
    mc = _main ( )
    pq = PriorityQueue ( 10 , mc )
    pq.append ( [ bias , 0 ] )
    while B not in fixed :
        cur = pq.pop ( )
        now = cur [ 0 ]
        if now in fixed : continue
        fixed.add ( now )
        dist.append ( cur [ 1 ] )
        for w in dic :
            if now + w not in fixed :
                if now + w > 2 * bias or now + w < 0 : continue
                if dist [ now + w ] > dist [ now ] + 1 :
                    dist [ now + w ] = dist [ now ] + 1
                    pq.append ( [ now + w , dist [ now ] + 1 ] )
    ans = dist [ B ]
    print ( ans )
class mycmp ( Main , object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
