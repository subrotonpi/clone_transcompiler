def main ( ) :
    import sys
    from collections import deque
    from random import randint
    for i in range ( sys.argv [ 1 ] ) :
        n = randint ( 1 , 10000 )
        a1 = [ ]
        a2 = [ ]
        a4 = [ ]
        for i in range ( n ) :
            a = randint ( 1 , 10000 )
            if a % 4 == 0 :
                a4.append ( a )
            elif a % 2 == 0 :
                a2.append ( a )
            else :
                a1.append ( a )
        if len ( a1 ) > len ( a4 ) + 1 or len ( a1 ) == 1 and a4 == [ ] :
            print ( "No" )
            continue
        a1_rem_flg = ( len ( a1 ) == len ( a4 ) + 1 )
        if a1_rem_flg and not a2 :
            print ( "No" )
            continue
        if not a1_rem_flg :
            pass
        if len ( a2 ) % 2 != 0 and a4 :
            print ( "No" )
            continue
        print ( "Yes" )
