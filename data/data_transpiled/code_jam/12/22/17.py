def round1B ( ) :
    import itertools
    import random
    import time
    def tie ( ) :
        global X , Y , Y
        global T
        t = time.time ( )
        dx = [ 0 , 0 , 1 , - 1 ]
        if currentLevel - F [ X , Y ] >= 20 :
            currentTime += 100
            P.append ( ( X , Y , currentTime ) )
    def tie ( ) :
        global T
        for l in range ( 1 , T + 1 ) :
            h = random.randint ( 0 , l )
            n = random.randint ( 0 , l )
            m = random.randint ( 0 , l )
            C = [ [ i for i in range ( n ) ] for j in range ( m ) ]
            F = [ [ i for i in range ( n ) ] for j in range ( m ) ]
            Can = [ [ 0 , 0 , 0 ] for i in range ( n ) ]
            for i in range ( n ) :
                if C [ i ] [ j ] - h >= 50 :
                    Can [ i ] [ j ] = 0
                else :
                    Can [ i ] [ j ] = h - ( C [ i ] [ j ] - 50 )
        visited = [ False ]
        P = [ tie ( ) for tie in itertools.product ( range ( n ) , range ( m ) ) ]
        res = - 1
        while not P.empty ( ) :
            temp = P.pop ( )
            x , y , t = temp
            if x == n - 1 and y == m - 1 :
                res = t
                break
            if visited [ x ] [ y ] :
                continue
            visited [ x ] [ y ] = True
            for i in range ( 4 ) :
                X = x + dx [ i ]
                Y = y + dy [ i ]
                if X < 0 or Y < 0 or X == n or Y == m :
                    continue
                if X < 0 or Y < 0 or X == m :
                    continue
                if Y < 0 or Y > 0 :
                    continue
                if X > 0 :
                    X = X + dx [ i ]
                    Y = Y + dy [ i ]
        return res
    tie ( )
