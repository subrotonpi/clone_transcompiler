def main ( ) :
    import math
    import os
    import os
    import os
    import math
    import math
    import math
    f = open ( 'A-large.in' , 'r' )
    f = open ( 'solve.txt' , 'w' )
    T = int ( f.readline ( ).strip ( ) )
    for t in range ( 1 , T + 1 ) :
        s = f.readline ( ).strip ( ).split ( )
        N = int ( s [ 0 ] )
        K = int ( s [ 1 ] )
        arr = [ [ int ( s [ 0 ] ) , int ( s [ 1 ] ) ] for s in s ]
        arr [ 2 ] = arr [ 2 ] [ 0 ] * arr [ 1 ] [ 1 ] * 2
        arr [ 0 ] = arr [ 0 ] [ 0 ] * arr [ 0 ] [ 0 ]
        arr = sorted ( arr , key = lambda a : a [ 2 ] )
        sum = max = val = 0
        for i in range ( 1 , K ) :
            sum += arr [ N - i ] [ 2 ]
            max = max ( arr [ N - i ] [ 0 ] , max )
        for i in range ( K , N + 1 ) :
            val = max ( val , sum + max ( max , arr [ N - i ] [ 0 ] ) + arr [ N - i ] [ 2 ] )
        f.write ( 'Case #%d: ' % t )
        f.write ( '%.9f\n' % ( math.pi * val ) )
    f.close ( )
    return
