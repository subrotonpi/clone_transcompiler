def main ( ) :
    import sys
    from matplotlib import pyplot as plt
    plt.ion ( )
    n = plt.grid ( True )
    m = plt.grid ( True )
    ans = np.zeros ( ( n , m ) )
    k = plt.grid ( True )
    x = np.array ( [ 0 , 0 ] )
    flag = True
    for i in range ( 1 , k + 1 ) :
        temp = plt.subplot ( n , k , i + 1 )
        for j in temp :
            if flag :
                ans [ x [ 0 ] ] [ x [ 1 ] ] = i
                x [ 0 ] = x [ 0 ] + 1
                if x [ 0 ] >= n and flag :
                    x [ 1 ] = x [ 1 ] + 1
                    x [ 0 ] = n - 1
                    flag = False
            else :
                ans [ x [ 0 ] ] [ x [ 1 ] ] = i
                x [ 0 ] = x [ 0 ] - 1
                if x [ 0 ] < 0 and not flag :
                    x [ 1 ] = x [ 1 ] + 1
                    x [ 0 ] = 0
                    flag = True
    for i in range ( n ) :
        for j in range ( m ) :
            plt.plot ( ans [ i ] , ans [ j ] , 'o' )
        plt.show ( )
