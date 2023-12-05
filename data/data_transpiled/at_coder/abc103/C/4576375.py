def main ( ) :
    import sys
    from numpy.linalg import eigs
    reader = open ( '/dev/null' , 'r' )
    N = eigs.shape [ 0 ]
    a = eigs.read ( N )
    ans = 0
    M = eigs.read ( N )
    for i in range ( N ) :
        ans += eigs.read ( N - 1 )
    reader.close ( )
    print ( ans , end = ' ' )
