def main ( args ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import ascii_letters
    from string import digits
    s1 = digits.letters
    s2 = digits.digits
    s3 = digits.letters
    sys.stdout.write ( chr ( ord ( s1 [ 0 ] ) - ord ( 'a' ) - ord ( 'A' ) ) )
    sys.stdout.write ( chr ( ord ( s2 [ 0 ] ) - ord ( 'a' ) - ord ( 'A' ) ) )
    sys.stdout.write ( chr ( ord ( s3 [ 0 ] ) - ord ( 'a' ) - ord ( 'A' ) ) + "\n" )
