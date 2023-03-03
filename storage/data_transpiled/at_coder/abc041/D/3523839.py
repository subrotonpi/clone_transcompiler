def __main ( ) :
    import sys
    from sympy.utilities.interactiveshell import InteractiveShell
    from sympy.utilities.misc import get_filesystem_encoding
    sc = InteractiveShell ( )
    n = sc.recv_number ( type = int , timeout = 1 )
    m = sc.recv_number ( type = int , timeout = 1 )
    faster = [ [ ] for i in range ( n ) ]
    for x , y in zip ( sc.recv_list ( type = int , timeout = 1 ) , sc.recv_list ( type = int , timeout = 1 ) ) :
        faster [ x ] [ y ] = True
    bit_dp = [ 1 ]
    bit_dp [ 0 ] = 1
    for i in range ( ( 1 << n ) - 1 ) :
        if bit_dp [ i ] == 0 :
            continue
        for j in range ( n ) :
            if ( ( i >> j ) & 1 ) == 0 :
                for k in range ( n ) :
                    if ( ( i >> k ) & 1 ) == 1 and faster [ j ] [ k ] :
                        break
                if k == n :
                    bit_dp [ i | 1 << j ] += bit_dp [ i ]
    print ( bit_dp [ ( 1 << n ) - 1 ] )
