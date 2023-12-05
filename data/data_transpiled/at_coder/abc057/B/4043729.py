def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    n = int ( sys.argv [ 1 ] )
    m = int ( sys.argv [ 2 ] )
    a = [ ]
    b = [ ]
    c = [ ]
    d = [ ]
    for i in range ( n ) :
        a.append ( random.random ( ) )
        b.append ( random.random ( ) )
        c.append ( random.random ( ) )
        d.append ( random.random ( ) )
    for i in range ( m ) :
        min_dis = 0
        for j in range ( m ) :
            dis = abs ( a [ i ] - c [ j ] ) + abs ( b [ i ] - d [ j ] )
            if j == 0 :
                min_dis = dis
                result.append ( j + 1 )
                continue
            if dis < min_dis :
                min_dis = dis
                result.append ( j + 1 )
    for i in range ( n ) :
        print ( result [ i ] )
