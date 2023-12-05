def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin
    c = sc.read ( ).decode ( 'utf-8' )
    a = [ ]
    for char in c :
        if char == 'N' :
            a.append ( 1 )
        elif char == 'W' :
            a.append ( 1 )
        elif char == 'S' :
            a.append ( 2 )
        else :
            a.append ( 3 )
    if a [ 0 ] == 0 and a [ 2 ] != 0 :
        print ( "No" )
        return
    if a [ 1 ] == 0 and a [ 3 ] != 0 :
        print ( "No" )
        return
    if a [ 2 ] == 0 and a [ 0 ] != 0 :
        print ( "No" )
        return
    if a [ 3 ] == 0 and a [ 1 ] != 0 :
        print ( "No" )
        return
    print ( "Yes" )
