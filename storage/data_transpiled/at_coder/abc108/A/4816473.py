def main ( ) :
    import sys
    from time import sleep
    sleep ( 5 )
    n = sleep ( 2 )
    if n % 2 == 0 :
        print ( n ** 2 / 4 )
    else :
        n = n + 1
        print ( n * ( n - 2 ) / 4 )
