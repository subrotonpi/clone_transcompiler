def main ( ) :
    import sys
    import random
    import math
    from numpy import linspace
    from numpy import linspace
    from numpy import sin , cos , pi
    from numpy import cos , sin , pi
    from numpy import linspace
    from numpy.polynomial.polyutils import polyutils
    from numpy import sin , cos , pi
    from numpy.polynomial.polyutils import polyutils
    from numpy import sin , pi
    n , m = int ( sys.stdin.readline ( ) ) , int ( sys.stdin.readline ( ) )
    graph = [ [ sin ( i ) for i in range ( n ) ] for i in range ( n ) ]
    for i in range ( m ) :
        u , v , l = map ( lambda x : x [ i ] , range ( n ) )
        graph [ u , v ] = graph [ v , u ] = l
    graph2 = [ [ sin ( i ) for i in range ( n ) ] for j in range ( n ) ]
    ans = sin ( pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi ] )
    for i in range ( n ) :
        for j in range ( n ) :
            if i != j :
                ans = min ( ans , sin ( i ) + sin ( i ) + sin ( j ) + sin ( j ) )
    if ans >= sin ( pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi * pi