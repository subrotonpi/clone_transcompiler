def main ( ) :
    import sys
    stdin_stream = sys.stdin
    c = [ ]
    z , y , fin , a1 , a2 = 0 , 0 , 0 , 0
    while z < 3 :
        while y < 3 :
            c.append ( stdin_stream.read ( ) )
            y += 1
        y = 0
        z += 1
    z = 1
    a1 = c [ 0 ] [ 0 ] - c [ 0 ] [ 1 ]
    a2 = c [ 0 ] [ 1 ] - c [ 0 ] [ 2 ]
    while z < 3 :
        if c [ z ] [ 0 ] - c [ z ] [ 1 ] != a1 :
            fin = 1
            break
        if c [ z ] [ 1 ] - c [ z ] [ 2 ] != a2 :
            fin = 1
            break
        z += 1
    if fin == 1 :
        print ( "No" )
    else :
        print ( "Yes" )
