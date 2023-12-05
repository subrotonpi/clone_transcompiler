def main ( ) :
    import sys
    from collections import defaultdict
    from time import time
    with open ( 'test.txt' , 'r' ) as infile :
        T = infile.read ( )
        CASE :
            for cas in range ( 1 , T + 1 ) :
                n = infile.read ( )
                N = [ infile.read ( ) - 1 ]
                for i in range ( n - 1 ) :
                    for j in range ( i + 1 , n - 1 ) :
                        if j < N [ i ] and N [ j ] > N [ i ] :
                            print ( 'Case #%d: Impossible\n' % cas , i , j )
                            continue
                X = defaultdict ( int )
                X [ n - 1 ] += 1000 * 1000 * 1000
                for i in range ( n ) :
                    if i in X :
                        continue
                    st = i
                    end = X.higherkey ( i )
                    c = i
                    X [ c ] = 0
                    while N [ c ] not in X :
                        c = N [ c ]
                        X [ c ] += ( X [ end ] + end - st - 1 ) / ( end - st ) * ( c - st )
                for i in range ( n ) :
                    if X [ i ] < 0 or X [ i ] > 1000 * 1000 * 1000 :
                        print ( 'OOPS: %d\n' % i )
                for i in range ( n ) :
                    for j in range ( i + 1 , n ) :
                        pj = X [ i ] + ( long ( X [ N [ i ] ] - X [ i ] ) ) * ( j - i ) / ( N [ i ] - i )
                        if ( j < N [ i ] and X [ j ] >= pj ) or ( j >= N [ i ] and X [ j ] > pj ) :
                            print ( 'BAD: %d (%d %d %d)\n' % ( i , j , pj , X [ j ] , N [ i ] ) )
