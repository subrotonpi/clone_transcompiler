def import solve
import sys
solve ( )
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as sc :
        n = sc.readline ( ).strip ( )
        p = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        count = 0
        for i in range ( n ) :
            if i == n - 1 and p [ i ] == ( i + 1 ) :
                x = p [ i ]
                p [ i ] , p [ i - 1 ] = p [ i - 1 ] , x
                count += 1
            elif p [ i ] == ( i + 1 ) :
                x = p [ i ]
                p [ i ] , p [ i + 1 ] = p [ i + 1 ] , x
                count += 1
        print ( count )
