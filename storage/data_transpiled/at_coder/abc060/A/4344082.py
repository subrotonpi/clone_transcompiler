def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import ascii_letters
    from string import digits
    A = ascii_letters.replace ( '' , '' )
    B = digits.replace ( '' , '' )
    C = digits.replace ( '' , '' )
    a , b , c = [ x for x in A if x in B ]
    if A [ a - 1 ] == B [ 0 ] and B [ b - 1 ] == C [ 0 ] :
        print ( "YES" )
    else :
        print ( "NO" )
