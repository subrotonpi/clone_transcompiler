def main ( ) :
    import sys
    import random
    import time
    random.seed ( 0 )
    T = random.randint ( 1 , 10000 )
    for zz in range ( 1 , T + 1 ) :
        N = random.randint ( 1 , 10000 )
        bat = random.randint ( 1 , 10000 )
        oat = random.randint ( 1 , 10000 )
        btime = otime = 0
        for i in range ( N ) :
            if random.randint ( 0 , 10000 ) == 1 :
                next = random.randint ( 0 , 10000 )
                btime = max ( btime + abs ( bat - next ) , otime ) + 1
                bat = next
            else :
                next = random.randint ( 0 , 10000 )
                otime = max ( otime + abs ( oat - next ) , btime ) + 1
                oat = next
        print ( 'Case #%d: %d\n' % ( zz , max ( btime , otime ) ) )
