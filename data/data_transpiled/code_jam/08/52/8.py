def round3 ( ) :
    import sys
    class Portal ( object ) :
        def __init__ ( self ) :
            self.n = len ( sys.stdin )
            for i in range ( 1 , n + 1 ) :
                r = i
                c = i
    j = 0
    while True :
        if p [ 0 ] + j >= r or map [ p [ 0 ] + j ].dist > p [ 1 ].dist :
            break
        j += 1
    if p [ 0 ] - j < 0 or map [ p [ 0 ] - j ].dist > p [ 1 ].dist :
        break
    j -= 1
    if p [ 0 ] - j < 0 or map [ p [ 0 ] - j ].dist > p [ 1 ].dist :
        break
    j = 0
    while True :
        if p [ 0 ] + j >= c or map [ p [ 0 ] - j ].dist > p [ 1 ].dist :
            break
        j += 1
    if p [ 0 ] + j >= c or map [ p [ 0 ] + j ].dist > p [ 1 ].dist :
        break
    j = 0
    while True :
        for k in range ( r ) :
            if map [ j ] [ k ] == '#' :
                continue
            point = Point ( j , k )
            for m in range ( r ) :
                if m > j or m > k or m + k >= c or map [ j - m ] [ k ] == '#' or map [ j ] [ k - m ] == '#' or map [ j ] [ k ] == '#' :
                    point.set_wall_dist ( m )
                    break
    class Point ( object ) :
        def __init__ ( self ) :
            self.x = 0
            self.y = 0
        def wall_dist ( self ) :
            self.x = x
            self.y = y
        def get_wall_dist ( self ) :
            return self.x
    if p [ 0 ] == '#' and p [ 1 ].dist > p [ 1 ].dist :
        return Portal ( p [ 0 ] , p [ 1 ] )
