def test_solve ( ) :
    import sys
    from sympy.utilities.iterables import solve
    solve ( )
    def solve ( ) :
        with open ( "test.txt" , "r" ) as f :
            n = int ( f.read ( ) )
            k = int ( f.read ( ) )
            a = [ i for i in range ( n ) if i != 0 ]
            x = 0
            if ( n - k ) % ( k - 1 ) == 0 :
                x = ( n - k ) / ( k - 1 )
            else :
                x = ( n - k ) / ( k - 1 ) + 1
            print ( x + 1 )
    solve ( )
