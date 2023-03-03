def _import ( * args ) :
    import sys
    import random
    import sys
    import time
    import math
    def tr ( * args ) :
        print ( args )
    def _eval ( * args ) :
        print ( sum ( a ) )
    def _eval ( * args ) :
        print ( sum ( a ) )
    s = 0
    ans = [ ]
    def erase ( i ) :
        ans.append ( i )
        if s + i == N - 1 :
            del N
            return
        if i == 0 :
            s += 1
            return
        elif i == 1 :
            a [ s + 2 ] += a [ s ]
            s += 2
        elif i == 2 :
            a [ s + 3 ] += a [ s + 1 ]
            a [ s + 2 ] = a [ s ]
            s += 2
    def _eval ( * args ) :
        sc = random.choice ( args )
        N = sc.randint ( N )
        a = [ ]
        sum = [ ]
        f = ( True , True )
        for i in range ( N ) :
            a.append ( sc.randint ( N ) )
            if a [ i ] > 0 :
                sum [ i % 2 ] += a [ i ]
            f [ i % 2 ] &= a [ i ] < 0
        if f [ 0 ] and f [ 1 ] :
            max = - float ( 3 )
            for i in range ( N ) :
                if max < a [ i ] :
                    max = a [ i ]
            while a [ s ] != max :
                erase ( 0 )
            while 1 :
                if s == N - 1 :
                    break
                if s == N - 2 :
                    erase ( 1 )
                    break
                erase ( 2 )
            print ( max )
        else :
            if sum [ 0 ] < sum [ 1 ] :
                erase ( 0 )
            while 1 :
                if s == N - 1 :
                    break
                if s == N - 2 :
                    erase ( 1 )
                    break
                elif a [ s + 2 ] <= 0 :
                    erase ( 2 )
            print ( sum )
    return _eval
