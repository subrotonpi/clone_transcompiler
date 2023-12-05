def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    n = randint ( 1 , 10000 )
    d = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    l = [ randint ( 0 , 10000 ) for i in range ( d ) ]
    r = [ randint ( 0 , 10000 ) for i in range ( d ) ]
    s = [ randint ( 0 , 10000 ) for i in range ( k ) ]
    t = [ randint ( 0 , 10000 ) for i in range ( k ) ]
    for start , goal in zip ( s , t ) :
        day = 0
        if start < goal :
            for i in range ( d ) :
                if l [ i ] <= start and r [ i ] >= start :
                    start = r [ i ]
                    if r [ i ] >= goal :
                        day = i + 1
                        break
            print ( day )
        else :
            for i in range ( d ) :
                if r [ i ] >= start and l [ i ] <= start :
                    start = l [ i ]
                    if l [ i ] <= goal :
                        day = j + 1
                        break
            print ( day )
