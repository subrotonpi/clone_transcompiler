def main ( ) :
    import sys
    from numpy.linalg import eigs
    sc = open ( "../../api/main.py" , "r" )
    st = sc.readline ( ).split ( )
    sc.close ( )
    n = [ int ( i ) for i in st ]
    tk = float ( n [ 1 ] ) / n [ 0 ]
    ao = float ( n [ 3 ] ) / n [ 2 ]
    if tk == ao :
        print ( "DRAW" )
    else :
        print ( "TAKAHASHI" if tk > ao else "AOKI" )
