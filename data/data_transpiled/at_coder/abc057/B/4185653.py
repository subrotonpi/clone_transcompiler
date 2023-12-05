def main ( srgs ) :
    import math
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    a = join ( srgs , sep )
    b = join ( srgs , sep )
    c = [ [ join ( srgs , sep ) ] * 2 ]
    d = [ [ join ( srgs , sep ) ] * 2 ]
    m = [ ]
    for i in range ( 0 , a ) :
        c.append ( join ( srgs , sep ) )
    for i in range ( 0 , b ) :
        d.append ( join ( srgs , sep ) )
    for i in range ( 0 , a ) :
        min = 1145148101
        C = 0
        for j in range ( 0 , b ) :
            K = 0
            K = abs ( c [ i ] [ 0 ] - d [ j ] [ 0 ] ) + abs ( c [ i ] [ 1 ] - d [ j ] [ 1 ] )
            if K < min :
                min = K
                C = j + 1
        m.append ( C )
    for i in range ( 0 , a ) :
        print ( m [ i ] )
