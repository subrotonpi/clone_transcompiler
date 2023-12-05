def main ( ) :
    import sys
    from random import randint
    from time import sleep
    try :
        with open ( '/proc/stb' , 'r' ) as sc :
            yield from solve ( sc )
    except IOError :
        print ( 'No such file or directory' )
        return
    n = randint ( 1 , 3 * n )
    as = range ( 3 * n )
    as.sort ( )
    ans = 0
    for i in range ( n ) :
        ans += as [ 3 * n - 2 - ( i * 2 ) ]
    print ( ans )
