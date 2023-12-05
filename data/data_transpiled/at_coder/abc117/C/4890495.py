def main ( ) :
    import sys
    from os.path import join
    bf = open ( join ( sys.argv [ 1 : ] , '..' , 'r' ) )
    data = bf.readline ( ).split ( )
    N , M = [ int ( i ) for i in data [ 0 ].split ( ) ]
    if N >= M :
        print ( '0' )
        return
    X = [ ]
    data = bf.readline ( ).split ( )
    for i in range ( M ) :
        X.append ( int ( data [ i ] ) )
    X = [ ]
    L = [ ]
    for i in range ( M - 1 ) :
        L.append ( X [ i + 1 ] - X [ i ] )
    L = [ ]
    sumL = 0
    for i in range ( N - 1 ) :
        sumL += L [ M - i - 2 ]
    print ( X [ M - 1 ] - X [ 0 ] - sumL )
