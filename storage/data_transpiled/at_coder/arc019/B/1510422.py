def main ( ) :
    import sys
    from string import printable
    s = printable.replace ( '' , '' )
    if len ( s ) == 1 :
        print ( 0 )
        return
    flag = True
    total = 0
    count = 0
    for i in range ( len ( s ) / 2 ) :
        if s [ i ] != s [ - i - 1 ] :
            count += 1
            flag = False
    if flag :
        if len ( s ) % 2 == 1 :
            total = 25 * ( len ( s ) - 1 )
        else :
            total = 25 * len ( s )
    elif count == 1 :
        total = 25 * len ( s ) - 2
    else :
        total = 25 * len ( s )
    print ( total )
