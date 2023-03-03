def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = open ( 'input.txt' , 'r' )
    s = sc.read ( )
    sc.close ( )
    sa = s.split ( )
    count = 100000000
    same_flg = True
    for i in range ( len ( s ) - 1 ) :
        if sa [ i ] != sa [ i + 1 ] :
            same_flg = False
    if same_flg :
        count = 0
    c = [ [ ' ' ] * 100 for i in range ( 100 ) ]
    for ch in [ 'a' , 'z' ] :
        for i in range ( 1 , 100 ) :
            for j in range ( len ( s ) - 1 ) :
                if c [ i - 1 ] [ j ] == ch or c [ i - 1 ] [ j + 1 ] == ch :
                    c [ i ] [ j ] = ch
                else :
                    c [ i ] [ j ] = c [ i - 1 ] [ j + 1 ]
            flg = True
            for j in range ( len ( s ) ) :
                if c [ i ] [ j ] != ch and c [ i ] [ j ] != ' ' :
                    flg = False
            if flg :
                count = min ( count , i )
                break
    print ( count )
