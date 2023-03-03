def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.recv_handle ( )
        x = [ sc.recv ( n ) ]
        array = [ ]
        ref = [ ]
        for i in range ( n ) :
            x.append ( sc.recv ( n ) )
            array.append ( i + 1 )
            ref.append ( i + 1 )
        pos = 0
        for i in range ( n ** 2 ) :
            if ref [ i ] > 0 :
                cnt = 0
                while cnt < array [ i ] - 1 :
                    if array [ pos ] == 0 :
                        array [ pos ] = array [ i ]
                        cnt += 1
                    pos += 1
        pos = n ** 2 - 1
        for i in range ( n ** 2 - 1 , - 1 , - 1 ) :
            if ref [ i ] > 0 :
                cnt = 0
                while cnt < n - array [ i ] :
                    if array [ pos ] == 0 :
                        array [ pos ] = array [ i ]
                        cnt += 1
                    pos -= 1
        for i in range ( n ** 2 ) :
            if ref [ i ] > 0 :
                cnt = 0
                for j in range ( i ) :
                    if array [ j ] == ref [ i ] :
                        cnt += 1
                if cnt != ref [ i ] - 1 :
                    print ( "No" )
                    return
                for j in range ( i + 1 , n ** 2 ) :
                    if array [ j ] == ref [ i ] :
                        cnt += 1
                if cnt != n - 1 :
                    print ( "No" )
                    return
    lines = [ ]
    print ( "Yes" )
    for i in range ( n ** 2 ) :
        lines.append ( array [ i ] + ( i == n ** 2 - 1 ) )
    print ( "\n".join ( lines ) )
