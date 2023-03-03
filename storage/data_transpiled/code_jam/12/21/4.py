def safety_in_numbers ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from os import path
    from os import rename
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from os import path
    from math
    from random import random
    from time import clock
    from time import sleep
    from time import sleep
    n = int ( time ( ) )
    answer = [ ]
    sum = 0
    a = [ path ( i ) for i in range ( n ) ]
    for i in range ( n ) :
        l = r = 1
        for j in range ( 100 ) :
            m = ( l + r ) *.5
            current_man = a [ i ] + m * sum
            all = m
            for k in range ( n ) :
                if k == i :
                    continue
                all += max ( 0 , ( current_man - a [ k ] ) / sum )
            if all > 1 :
                r = m
            else :
                l = m
        answer.append ( ( l + r ) * 50 )
    for e in answer :
        print ( " " , e , end = ' ' )
    print ( )
