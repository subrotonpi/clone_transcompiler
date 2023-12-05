def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    k = int ( ceil ( log ( sys.stdin.read ( ) ) ) )
    log ( log ( sys.stdin.read ( ) ) )
    n = 50
    ans = [ ]
    quo = k / n
    rem = int ( k % n )
    for i in range ( n ) :
        ans.append ( n - 1 + quo )
    for i in range ( rem ) :
        ans.append ( n - ( rem - 1 ) )
    for i in range ( rem ) :
        ans.append ( rem )
    print ( n )
    for i in range ( n - 1 ) :
        print ( ans [ i ] , end = ' ' )
    print ( ans [ n - 1 ] )
