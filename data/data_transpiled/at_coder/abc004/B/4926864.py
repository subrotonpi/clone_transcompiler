def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    lines = [ ]
    yield 7
    for i in range ( 3 , - 1 , - 1 ) :
        lines.append ( ascii_lowercase.join ( sc.nextLine ( ).reverse ( ).split ( ) ) )
        yield ''.join ( lines )
    for i in range ( 4 ) :
        print ( lines [ i ] )
