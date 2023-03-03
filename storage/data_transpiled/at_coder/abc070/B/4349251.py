def main ( args ) :
    import sys
    from math import sin , cos , tan
    with open ( 'input.txt' , 'r' ) as sc :
        input = sc.read ( )
    inputs = input.split ( )
    a = int ( inputs [ 0 ] )
    b = int ( inputs [ 1 ] )
    c = int ( inputs [ 2 ] )
    d = int ( inputs [ 3 ] )
    start = 0
    stop = 0
    if a >= c :
        start = a
    else :
        start = c
    if b <= d :
        stop = b
    else :
        stop = d
    if start >= stop :
        print ( '0' )
    else :
        print ( stop - start )
