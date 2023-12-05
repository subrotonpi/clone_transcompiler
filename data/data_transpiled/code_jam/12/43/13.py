def main ( args ) :
    import sys
    import random
    import sys
    import math
    from time import time
    try :
        random.seed ( )
        T = time ( )
    except NameError :
        T = 0
    for ca in range ( 1 , T + 1 ) :
        rtn = False
        n = random.randint ( 1 , T )
        a = [ random.randint ( 0 , n - 1 ) for i in range ( n - 1 ) ]
        TRIALS = 10000000
        h = [ 0 ] * n
        while TRIALS :
            good = True
            for i in range ( n - 1 ) :
                m = - 999999999
                max = - 1
                for j in range ( i + 1 , n ) :
                    tm = float ( h [ j ] - h [ i ] ) / ( j - i )
                    if tm > m :
                        m = tm
                        max = j
                if max != a [ i ] :
                    good = False
                    h [ a [ i ] ] += 1
                    break
            if good :
                break
        print ( 'Case #%d:' % ca , end = ' ' )
        if TRIALS <= 0 :
            print ( ' Impossible' )
        else :
            for i in range ( n ) :
                print ( ' %d' % h [ i ] , end = ' ' )
            print ( )
