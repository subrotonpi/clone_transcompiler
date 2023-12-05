def main ( ) :
    import sys
    for n in range ( 1 , len ( sys.argv ) ) :
        a4cnt = a2cnt = a1cnt = 0
        for i in range ( n ) :
            a = sys.argv [ i ]
            if a % 4 == 0 :
                a4cnt += 1
            elif a % 2 == 0 :
                a2cnt += 1
            else :
                a1cnt += 1
        a1cnt += a2cnt % 2
        if a1cnt > a4cnt + 1 :
            print ( "No" )
        else :
            print ( "Yes" )
