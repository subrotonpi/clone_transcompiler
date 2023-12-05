def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import sin
    from math import log
    from math import log
    n = int ( ceil ( log ( n ) ) )
    m = int ( ceil ( log ( n ) ) )
    for i in range ( m // n , 1 , - 1 ) :
        if m % i == 0 :
            print ( i )
            return
