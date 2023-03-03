def main ( ) :
    import sys
    from itertools import repeat
    n , m , c = map ( int , sys.stdin.readline ( ).split ( ) )
    b = repeat ( c )
    count = 0
    for i in range ( n ) :
        sum = c
        for j in range ( m ) :
            sum += repeat ( i , j ) * b [ j ]
        if sum :
            count += 1
    print ( count )
