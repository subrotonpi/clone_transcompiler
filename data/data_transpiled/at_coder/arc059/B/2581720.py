def main ( ) :
    import sys
    from string import printable
    s = printable.split ( ' ' )
    t = False
    for i in range ( len ( s ) - 2 ) :
        if s [ i ] == s [ i + 1 ] :
            print ( ( i + 1 , ) , end = ' ' )
            t = True
            break
        if s [ i ] == s [ i + 2 ] :
            print ( ( i + 1 , ) , end = ' ' )
            t = True
            break
    if not t :
        if s [ - 2 ] == s [ - 1 ] :
            print ( ( s [ - 1 ] , ) , end = ' ' )
        else :
            print ( '-1 -1' , end = ' ' )
