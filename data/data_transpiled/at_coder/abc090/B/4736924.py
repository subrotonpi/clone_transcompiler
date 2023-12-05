def main ( ) :
    import sys
    from string import ascii_lowercase
    reader = open ( 'input.txt' , 'r' )
    str_a = reader.read ( )
    A = [ ]
    str_b = reader.read ( )
    B = [ ]
    for i in range ( 5 ) :
        A.append ( unicodedata.normalize ( 'NFKD' , str_a ) )
        B.append ( unicodedata.normalize ( 'NFKD' , str_b ) )
    ans = 0
    C = [ ]
    C.append ( B [ 0 ] - A [ 0 ] )
    if C [ 0 ] == 0 :
        C.append ( B [ 1 ] - A [ 1 ] - 1 )
    else :
        C.append ( 10 )
    if C [ 1 ] == 0 :
        C.append ( B [ 2 ] - A [ 2 ] - 1 )
    else :
        C.append ( 10 )
    ans = C [ 0 ] * C [ 1 ] * C [ 2 ]
    int_a = int ( str_a )
    below = 0
    for i in range ( A [ 0 ] * 10000 , int_a + 1 ) :
        n1 = i / 10000
        n2 = i % 10000 / 1000
        n4 = i % 100 / 10
        n5 = i % 10
        if n1 == n5 and n2 == n4 :
            below += 1
    int_b = int ( str_b )
    above = 0
    for i in range ( B [ 0 ] * 10000 , int_b + 1 ) :
        n1 = i / 10000
        n2 = i % 10000 / 1000
        n4 = i % 100 / 10
        n5 = i % 10
        if n1 == n5 and n2 == n4 :
            above += 1
    print ( ans - below + above )
    reader.close ( )
