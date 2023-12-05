def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    s1 = ascii_letters.replace ( '' , '' )
    s2 = ascii_letters.replace ( '' , '' )
    s3 = digits.replace ( '' , '' )
    print ( s1 [ 0 ].upper ( ) + s2 [ 0 ].upper ( ) + s3 [ 0 ].upper ( ) )
