def main ( ) :
    import sys
    from string import printable
    sc = open ( 'S' , 'r' )
    S = sc.read ( )
    sc.close ( )
    n = w = s = e = 0
    for c in S :
        if c == 'N' :
            n += 1
        elif c == 'S' :
            s += 1
        elif c == 'E' :
            e += 1
        else :
            w += 1
    if ( n == 0 and s != 0 ) or ( n != 0 and s == 0 ) :
        print ( 'No' )
    elif ( e == 0 and w != 0 ) or ( e != 0 and w == 0 ) :
        print ( 'No' )
    else :
        print ( 'Yes' )
