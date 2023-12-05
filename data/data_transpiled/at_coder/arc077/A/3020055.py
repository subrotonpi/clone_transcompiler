def main ( ) :
    import sys
    from itertools import repeat
    n = len ( sys.stdin.readline ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    for i in range ( n - 1 , - 1 , - 2 ) :
        print ( a [ i ] , end = ' ' )
    if i == - 2 :
        for i in range ( 1 , n , 2 ) :
            print ( a [ i ] , end = ' ' )
    elif i == - 1 :
        for i in range ( 0 , n , 2 ) :
            print ( a [ i ] , end = ' ' )
    print ( )
