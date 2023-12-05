def main ( ) :
    import sys
    def test_ABC086A ( ) :
        with open ( 'ABC086A' , 'r' ) as f :
            a = f.read ( )
        with open ( 'ABC086B' , 'r' ) as f :
            b = f.read ( )
        if ( a * b ) % 2 == 0 :
            print ( 'Even' )
        else :
            print ( 'Odd' )
    def test_ABC081A ( ) :
        with open ( 'ABC081A' , 'r' ) as f :
            str = f.read ( )
            chr = str.decode ( 'utf-8' )
            count = 0
            for i in range ( 3 ) :
                if chr [ i ] == '1' :
                    count += 1
            print ( count )
    def test_ABC081A ( ) :
        with open ( 'ABC081A' , 'r' ) as f :
            N = f.read ( )
        A = [ test_ABC081A ( ) for _ in range ( 1 , N + 2 ) ]
        A.insert ( 0 , 0 )
        A.insert ( 1 , 0 )
        ans = 0
        for i in range ( 1 , N + 2 ) :
            ans += abs ( A [ i ] - A [ i - 1 ] )
        for i in range ( 1 , N + 1 ) :
            print ( ans - abs ( A [ i ] - A [ i - 1 ] ) - abs ( A [ i + 1 ] - A [ i ] ) + abs ( A [ i + 1 ] - A [ i - 1 ] ) )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    test_ABC081A ( )
    