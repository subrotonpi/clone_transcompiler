def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    sc = open ( "/proc/stations" , "r" )
    n = sc.read ( )
    arr = [ ]
    for i in chain ( range ( 101 ) , repeat ( n ) ) :
        arr.append ( sc.read ( ) )
    arr.sort ( )
    count = 0
    for i in range ( 100 ) :
        count += arr [ i ]
    if arr [ 100 ] < count :
        print ( "Yes" )
    else :
        print ( "No" )
