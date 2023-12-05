def import _main
class Main ( object ) :
    def __init__ ( self , idx , dd ) :
        self.idx = idx
        self.dd = dd
    def main ( self , x1 , ys , xt , yt , N ) :
        L = N + 2
        x = [ ]
        y = [ ]
        r = [ ]
        for i in range ( N ) :
            x.append ( sc.uniform ( - x1 , x1 ) )
            y.append ( sc.uniform ( - y1 , y1 ) )
            r.append ( sc.uniform ( - x1 , y1 ) )
        x.append ( xs )
        y.append ( ys )
        x.append ( xt )
        y.append ( yt )
        d = [ ]
        for i in range ( L ) :
            for j in range ( L ) :
                d [ i ] [ j ] = d [ j ] [ i ] = max ( 0 , dis ( x [ i ] , y [ i ] , x [ j ] , y [ j ] ) - r [ i ] - r [ j ] )
        s = N
        t = s + 1
        min_d = [ ]
        min_d.append ( 1l << 40 )
        q = PriorityQueue ( lambda p1 , p2 : cmp ( p1.dd , p2.dd ) )
        q.put ( ( s , 0 ) )
        while not q.empty ( ) :
            cur = q.pop ( )
            if cur.dd < min_d [ cur.idx ] :
                min_d [ cur.idx ] = cur.dd
                if cur.idx == t : break
                for i in range ( L ) :
                    if cur.dd + d [ cur.idx ] [ i ] < min_d [ i ] :
                        q.put ( ( i , cur.dd + d [ cur.idx ] [ i ] ) )
        print ( min_d [ t ] )
