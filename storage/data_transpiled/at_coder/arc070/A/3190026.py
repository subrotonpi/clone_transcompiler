def main ( ) :
    import sys
    import time
    for X in sys.stdin :
        X = time.time ( )
        sum = 0
        for i in range ( 1 , X ) :
            sum += i
        print ( i - 1 )
