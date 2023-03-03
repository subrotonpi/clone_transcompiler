def main ( ) :
    import sys
    for line in sys.stdin :
        N = int ( line )
        t = [ ]
        max = sys.maxint
        max_idx = - 1
        for i in range ( N ) :
            t.append ( line )
            abs = abs ( t [ i ] )
            if max < abs :
                max = abs
                max_idx = i
        print ( N * 2 - 1 )
        for i in range ( N ) :
            print ( ( max_idx + 1 ) , i + 1 )
        for i in range ( N - 1 ) :
            if t [ max_idx ] > 0 :
                print ( ( i + 1 ) , i + 2 )
            else :
                print ( ( N - i ) , N - i - 1 )
