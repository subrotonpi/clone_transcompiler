def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = len ( self.sc )
    day = [ 0 ] * 366
    for i in range ( 366 ) :
        if ( i % 7 == 0 ) :
            day [ i ] = 1
    D = [ 31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 ]
    hin = [ 0 ] * N
    for ho in self.sc :
        sp = ho.split ( '/' )
        m , d = map ( int , sp [ 0 ].split ( '.' ) )
        sum = 0
        for j in range ( m - 1 ) :
            sum += D [ j ]
        sum += d
        day [ sum - 1 ] += 1
        hin.append ( sum - 1 )
    for i in range ( N - 1 , - 1 , - 1 ) :
        index = hin [ i ]
        if day [ index ] > 1 :
            day [ index ] = 1
            for j in range ( index + 1 , 366 ) :
                if day [ j ] == 0 :
                    day [ j ] = 1
                    break
    for i in range ( 366 ) :
        if ( i > 0 ) :
            day [ i ] += day [ i - 1 ]
    ans = 0
    for i in range ( 366 ) :
        ans = max ( ans , day [ i ] )
    print ( ans )
