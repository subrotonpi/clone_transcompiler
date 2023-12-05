def main ( ) :
    import sys
    from string import ascii_letters
    import string
    N = len ( ascii_letters )
    c = [ [ ] for _ in range ( N ) ]
    for s in ascii_letters :
        for i in range ( N ) :
            c [ i ].append ( s )
    sys.stdout.write ( "\n" )
    for i in range ( N ) :
        for j in range ( N - 1 , - 1 , - 1 ) :
            sys.stdout.write ( c [ j ] [ i ] )
        sys.stdout.write ( "\n" )
