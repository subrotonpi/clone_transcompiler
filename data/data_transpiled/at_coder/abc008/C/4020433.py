def import import _sys , float , float , float , int , float , float , int , float , float , int , float , float , bool , None ) :
    from sys import stdin
    from time import sleep
    n = int ( stdin.readline ( ) )
    arr = [ int ( x ) for x in stdin.readline ( ).split ( ' ' ) ]
    num_divider = [ ]
    for i in range ( n ) :
        num = 0
        for j in range ( n ) :
            if i != j and arr [ i ] % arr [ j ] == 0 :
                num += 1
        num_divider.append ( num )
    result = 0.0
    for i in range ( n ) :
        if num_divider [ i ] % 2 == 0 :
            result += float ( num_divider [ i ] + 2 ) / float ( 2 * num_divider [ i ] + 2 )
        else :
            result += 0.5
    print ( result )
