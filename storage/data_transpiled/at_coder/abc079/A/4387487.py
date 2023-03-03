def main ( args ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    str = sc.next ( )
    cnt = 0
    for i in range ( len ( str ) - 1 ) :
        if str [ i ] == str [ i + 1 ] :
            cnt += 1
            if cnt >= 2 :
                print ( "Yes" )
                return
        else :
            cnt = 0
    print ( "No" )
