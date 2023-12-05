def main ( ) :
    import sys
    from random import randint
    from math import fabs
    from math import sin , cos , cos , log
    from math import sin , cos , log
    n = randint ( 1 , 50 )
    m = randint ( 1 , 50 )
    student = [ ]
    point = [ ]
    for a , b in zip ( range ( n ) , range ( m ) ) :
        student.append ( [ a , b ] )
    for c , d in zip ( range ( m ) , range ( n ) ) :
        point.append ( [ c , d ] )
    print ( )
    for i in range ( n ) :
        min = abs ( student [ i ] [ 0 ] - point [ 0 ] [ 0 ] ) + abs ( student [ i ] [ 1 ] - point [ 0 ] [ 1 ] )
        check = 1
        for j in range ( m ) :
            dist = abs ( student [ i ] [ 0 ] - point [ j ] [ 0 ] ) + abs ( student [ i ] [ 1 ] - point [ j ] [ 1 ] )
            if min > dist :
                min = dist
                check = j + 1
        print ( check )
