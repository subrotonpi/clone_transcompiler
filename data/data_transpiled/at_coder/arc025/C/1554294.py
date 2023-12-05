def import _main
class Main ( object ) :
    def __init__ ( self , o ) :
        sc = _main ( o )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        r = sc.__next__ ( )
        t = sc.__next__ ( )
        node = [ ]
        for i in range ( N ) :
            node.append ( [ ] )
        for a , b , c in _main ( o ) :
            node [ a ].append ( ( b , c ) )
            node [ b ].append ( ( a , c ) )
        sum = 0
        for i in range ( N ) :
            dist = _dijkstra ( node , i )
            for j in range ( 1 , N ) :
                ( d , idx ) = _bisect ( dist , d )
                if idx < 0 :
                    break
                sum += N - idx - ( r < t )
        print ( sum )
    def binarySearch ( a , v ) :
        l , r , s = 0 , len ( a ) - 1 , - 1
        while l <= r :
            m = ( l + r ) // 2
            if a [ m ] >= v :
                s , r = m , m - 1
            else :
                l = m + 1
        return s
    def dijkstra ( node , s ) :
        qu = _PriorityQueue ( )
        qu.append ( ( s , 0 ) )
        dist = [ ]
        dist.append ( int ( dist [ s ] ) )
        while not qu.empty ( ) :
            p = qu.get ( )
            if dist [ p.id ] < int ( dist [ s ] ) :
                continue
            dist [ p.id ] = p.dist
            for e in node [ p.id ] :
                qu.append ( ( e.to , e.dist + p.dist ) )
        return dist
return Main
