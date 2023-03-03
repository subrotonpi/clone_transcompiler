def main ( ) :
    import sys
    from string import ascii_letters
    input = raw_input ( "Enter a number of letters: " )
    N = input.replace ( '1' , '2' )
    N = N.replace ( '9' , '1' )
    N = N.replace ( '2' , '9' )
    sys.stdout.write ( N )
