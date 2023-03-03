def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import ceil
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( randint ( 1 , 5 ) )
    a = [ ]
    sum = 0
    for i in range ( n ) :
        a.append ( log ( i ) )
        sum += a [ i ]
    total = long ( n ) * long ( n + 1 ) / 2
    if sum % total != 0 :
        print ( "NO" )
        return
    if n == 1 :
        print ( "YES" )
        return
    d = [ ]
    num = int ( sum / total )
    d.append ( a [ 0 ] - a [ n - 1 ] - num )
    for i in range ( 1 , n ) :
        d.append ( a [ i ] - a [ i - 1 ] - num )
    sum2 = 0
    for i in range ( n ) :
        if d [ i ] % ( n ) != 0 or d [ i ] > 0 :
            print ( "NO" )
            return
        sum2 += d [ i ] / n
    if sum2 + num == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
