def main ( args ) :
    import sys
    from time import sleep
    from math import log
    n = int ( ceil ( n / 1000 ) )
    power = 1
    for i in range ( 1 , n + 1 ) :
        power *= i
        power %= 1000000007
    print ( power )
