def main ( ) :
    import sys
    from sympy.utilities.iterables import variations
    with open ( 'test.txt' , 'r' ) as f :
        A = f.read ( )
        B = f.read ( )
        for i in variations ( 1 ) :
            j = A * i
            if j == B :
                print ( A + B )
                break
            if j > B :
                print ( B - A )
                break
