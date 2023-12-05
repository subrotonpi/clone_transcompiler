def main ( ) :
    import sys
    import os
    import subprocess
    import sys
    import subprocess
    import sys
    a = int ( sys.stdin.readline ( ) )
    b = int ( sys.stdin.readline ( ) )
    c = int ( sys.stdin.readline ( ) )
    target = int ( sys.stdin.readline ( ) )
    count = 0
    for i in range ( 0 , a ) :
        for j in range ( 0 , b ) :
            for k in range ( 0 , c ) :
                if ( i * 500 ) + ( j * 100 ) + ( k * 50 ) == target :
                    count += 1
    print ( count )
