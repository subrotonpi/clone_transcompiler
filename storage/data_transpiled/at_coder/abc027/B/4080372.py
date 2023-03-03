def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import pi
    from math import log
    n = int ( sys.stdin.readline ( ) )
    arr = [ ]
    arr.append ( log ( pi ) )
    for i in range ( 1 , n ) :
        arr.append ( arr [ i - 1 ] + log ( pi ) )
    if arr [ n - 1 ] == 0 :
        print ( 0 )
        return
    if arr [ n - 1 ] % n != 0 :
        print ( - 1 )
        return
    same = arr [ n - 1 ] / n
    count = 0
    for i in range ( n - 1 ) :
        if arr [ i ] % same == 0 and arr [ i ] / same == i + 1 :
            count += 1
    print ( n - 1 - count )
