def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import log
    from math import sin , cos , cos , pi
    n = int ( sys.argv [ 1 ] )
    a = [ sin ( i ) for i in range ( n ) ]
    b = [ sin ( i ) for i in range ( n ) ]
    count = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if ( a [ i ] + count ) % b [ i ] != 0 :
            count += b [ i ] - ( ( a [ i ] + count ) % b [ i ] )
    print ( count )
