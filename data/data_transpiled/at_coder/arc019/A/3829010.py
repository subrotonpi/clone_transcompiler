def main ( ) :
    import sys
    from string import printable
    from string import printable
    S = printable.replace ( '' , '' )
    c = printable.replace ( '' , '' )
    for char in S :
        if char == 'O' :
            sys.stdout.write ( '0' )
        elif char == 'D' :
            sys.stdout.write ( '0' )
        elif char == 'I' :
            sys.stdout.write ( '1' )
        elif char == 'Z' :
            sys.stdout.write ( '2' )
        elif char == 'S' :
            sys.stdout.write ( '5' )
        elif char == 'B' :
            sys.stdout.write ( '8' )
        else :
            sys.stdout.write ( char )
    sys.stdout.write ( '\n' )
