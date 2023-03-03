def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    N = int ( sys.argv [ 1 ] )
    T = int ( sys.argv [ 2 ] )
    total = 0
    time_total = 0
    sleep ( 1 )
    for i in range ( N - 1 ) :
        temp = sleep ( 1 )
        total += min ( T , temp - time_total )
        time_total = temp
    total += T
    print ( total )
