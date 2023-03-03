def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    n = randint ( 1 , 5 )
    sum = 0
    max = 0
    for i in range ( n ) :
        a = log ( i )
        max = max ( max , a )
        sum += a
    if max < sum - max :
        print ( "Yes" )
    else :
        print ( "No" )
    sys.exit ( 1 )
