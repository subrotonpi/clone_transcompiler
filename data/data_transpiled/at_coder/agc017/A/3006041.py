def main ( ) :
    import sys
    from itertools import count
    from random import randint
    N = randint ( 1 , N )
    P = randint ( 1 , P )
    x = [ ]
    count0 = 0
    count1 = 0
    for i in range ( N ) :
        x.append ( randint ( 1 , N ) )
        if x [ i ] == 1 :
            count1 = count1 + 1
        else :
            count0 = count0 + 1
    if count1 == 0 :
        if P == 1 :
            print ( 0 )
        else :
            print ( long ( randint ( 2 , N ) ) )
    else :
        print ( long ( randint ( 2 , N - 1 ) ) )
    sys.exit ( 1 )
