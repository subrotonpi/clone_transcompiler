def main ( args ) :
    from numpy import npy_array
    from numpy.core import Queue
    from numpy.core import Scanner
    sc = Scanner ( )
    N = sc.next ( )
    n = int ( N )
    s = N.count ( '.' )
    T = N.split ( '.' )
    ni = True
    nu = True
    for i in range ( s ) :
        if N [ i ] != '9' :
            ni = False
        if i > 0 and N [ i ] != '9' :
            nu = False
    if ni :
        print ( s * 9 )
    elif nu :
        print ( 9 * ( s - 1 ) + int ( T ) )
    else :
        print ( 9 * ( s - 1 ) + int ( T ) - 1 )
