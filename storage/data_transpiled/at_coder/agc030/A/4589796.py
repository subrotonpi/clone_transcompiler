def main ( ) :
    import sys
    from sympy.utilities.iterables import variations
    with open ( 'test.txt' , 'r' ) as f :
        a = f.read ( )
        b = f.read ( )
        c = f.read ( )
        if ( a + b ) >= c :
            print ( b + c )
        else :
            print ( ( ( 2 * b ) + a + 1 ) )
