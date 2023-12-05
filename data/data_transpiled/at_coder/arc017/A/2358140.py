def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , sqrt
    sc = sys.stdin
    n = int ( sc.read ( ) )
    f = [ i for i in range ( 2 , n + 1 ) ]
    for i in range ( 2 , sqrt ( n ) + 1 ) :
        for j in range ( i + i , n + 1 , i ) :
            f [ j ] = 0
    if f [ n ] != 0 :
        print ( "YES" )
    else :
        print ( "NO" )
