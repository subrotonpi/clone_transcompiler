def _ _ main _ _ ( * args ) : return sys.stdin.write
INPUT = ''
mod = 1_000_000_007
inf = int ( sys.maxsize )
def solve ( ) :
    n = ni ( )
    d1 = ni ( )
    d2 = ni ( )
    map = color_map ( d1 , n )
    while not que.empty ( ) :
        cur = que.get ( )
        map [ cur [ 0 ] ] = cur [ 1 ]
        cur [ 2 ] = 1
    def is_space_char ( c ) :
        return not ( c >= 33 and c <= 126 )
    def skip ( ) :
        while ( b = read ( ) ) :
            for j in range ( 2 * n ) :
                if b in seen [ cur [ 0 ] ] :
                    cur = que.get ( )
                    map [ cur [ 0 ] ] = 1
    def nd ( ) :
        return float ( ns ( ) )
    def nc ( ) :
        for i in range ( 2 * n ) :
            map3 [ i ] = map [ i ] + 2 * map2 [ i ]
    def num ( ) :
        for i in range ( 4 ) :
            if i in seen [ cur [ 1 ] ] :
                return i
    def nm ( n ) :
        return ' '.join ( map [ i ] for i in range ( n ) )
    def nm ( n ) :
        for i in range ( n ) :
            for j in range ( 2 * n ) :
                if b in seen [ cur [ 1 ] ] :
                    return i
    def nm ( n ) :
        for i in range ( n ) :
            map [ i ] = ns ( )
        return map [ i ]
    def na ( n ) :
        for i in range ( n ) :
            for j in range ( n ) :
                if b in seen [ cur [ 1 ] ] :
                    return i
    def nd ( ) :
        for i in range ( n ) :
            for j in range ( 2 * n ) :
                if b in seen [ cur [ 1 ] ] :
                    return i
    return nd
