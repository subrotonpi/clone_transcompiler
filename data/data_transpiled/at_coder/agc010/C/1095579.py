def main ( ) :
    import random
    from numpy import array
    from numpy import array
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import random
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    N = seed ( )
    A = array ( [ seed ( ) ] )
    a = [ seed ( ) ]
    b = [ seed ( ) ]
    adj = [ [ ] ]
    for i in range ( N ) :
        A.append ( random.random ( ) )
        adj.append ( [ ] )
    for i in range ( N - 1 ) :
        a.append ( random.random ( ) )
        b.append ( random.random ( ) )
        adj [ a [ i ] - 1 ].append ( b [ i ] - 1 )
        adj [ b [ i ] - 1 ].append ( a [ i ] - 1 )
    seed ( )
    ans = "YES" if get_nt ( 0 , - 1 ) == 0 else "NO"
    print ( ans )
    def get_nt ( cur , parent ) :
        if parent != - 1 and len ( adj [ cur ] ) == 1 :
            return A [ cur ]
        max = 0
        sum = 0
        for child in adj [ cur ] :
            if child == parent :
                continue
            cnt = get_nt ( child , cur )
            if cnt == - 1 :
                return - 1
            sum += cnt
            max = max ( cnt , max )
        if parent == - 1 and len ( adj [ cur ] ) == 1 :
            return A [ cur ] == sum
        if A [ cur ] > sum :
            return - 1
        if sum - A [ cur ] > sum - max or sum - A [ cur ] > sum / 2 :
            return - 1
        return 2 * A [ cur ] - sum
    return get_nt
