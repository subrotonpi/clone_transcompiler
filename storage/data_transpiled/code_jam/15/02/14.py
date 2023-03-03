def _import ( ) :
    import sys
    import os
    import sys
    import random
    import time
    import random
    import sys
    class B :
        SAMPLE = False
        PROBLEM = 'B'
        INPUT = 'large'
        ID = '0'
        PATH = '/Users/wangkai/Documents/codejam-commandline-1.2-beta1/source/'
        LIMIT = 1000
    f = open ( PATH + PROBLEM + '-' + INPUT + '-' + ID + '.in' , 'r' ) if SAMPLE else open ( PATH + PROBLEM + '-' + INPUT + '-' + ID + '.out' , 'w' )
    test = random.randint ( 1 , 10000 )
    for t in range ( 1 , test + 1 ) :
        print ( 'Case #%d: ' % t , end = '' )
        diner_num = random.randint ( 1 , 10000 )
        diners = [ random.randint ( 1 , 10000 ) for _ in range ( diner_num ) ]
        lower = 0
        upper = LIMIT
        time = - 1
        while lower <= upper :
            middle = ( lower + upper ) // 2
            if _can_finish ( diners , middle ) :
                time = middle
                upper = middle - 1
            else :
                lower = middle + 1
        print ( time , end = '' )
    f.close ( )
    del f
    print ( 'finish!' )
