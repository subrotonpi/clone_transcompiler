def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = int ( sc.readline ( ) )
    a = int ( sc.readline ( ) )
    b = int ( sc.readline ( ) )
    c = 0
    for i in range ( 1 , n + 1 ) :
        if i <= 5 :
            c += b
        else :
            c += a
    print ( c )
