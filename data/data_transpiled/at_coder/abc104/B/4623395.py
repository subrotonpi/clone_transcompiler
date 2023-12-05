def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    s = sc.next ( )
    b1 , b2 , b3 = False , True
    b1 = ( s [ 0 ] == 'A' )
    for i in range ( 1 , len ( s ) ) :
        c = s [ i ]
        if i != 1 and i != len ( s ) - 1 and c == 'C' :
            if not b2 :
                b2 = True
            else :
                b1 = False
        elif c.isupper ( ) :
            b3 = False
    if b1 and b2 and b3 :
        print ( 'AC' )
    else :
        print ( 'WA' )
