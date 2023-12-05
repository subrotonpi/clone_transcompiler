def main ( ) :
    import sys
    import random
    import time
    class Space ( object ) :
        def __init__ ( self ) :
            self.T = random.randint ( 1 , 10000 )
    for i in range ( 1 , T + 1 ) :
        L , t , N , C = random.randint ( 1 , 1000001 )
        time = t
        a = [ random.randint ( 1 , 1000001 ) for _ in range ( C ) ]
        for j in range ( C , N ) :
            a [ j ] = a [ j - C ]
        index = 0
        while t > 0 and index < N :
            if a [ index ] > ( t // 2 ) :
                a [ index ] -= t // 2
                t = - 1
            else :
                t -= a [ index ] * 2
                index += 1
        if t > 0 :
            time -= t
        if index < N :
            a [ index : int ( N ) ] = a [ index : int ( N ) ]
            for j in range ( int ( N - 1 ) , index - 1 , - 1 ) :
                if L > 0 :
                    time += a [ j ]
                    L -= 1
                else :
                    time += a [ j ] * 2
        print ( "Case #{}: {}".format ( i , time ) )
