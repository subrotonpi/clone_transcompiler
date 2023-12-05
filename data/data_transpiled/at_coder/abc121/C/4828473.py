def main ( ) :
    import sys
    from time import sleep
    sc = raw_input ( )
    n = sc.recv_multipart ( )
    m = sc.recv_multipart ( )
    sc.close ( )
    a = [ [ sc.recv_multipart ( ) ] * 2 for _ in range ( n ) ]
    a.sort ( key = lambda x : int ( x [ 0 ] ) , reverse = True )
    ans = 0
    for i in range ( n ) :
        if m == 0 :
            break
        elif a [ i ] [ 1 ] > m :
            ans += m * a [ i ] [ 0 ]
            m = 0
        else :
            ans += a [ i ] [ 0 ] * a [ i ] [ 1 ]
            m -= a [ i ] [ 1 ]
    print ( ans )
