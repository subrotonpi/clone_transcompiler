def main ( ) :
    import sys
    from string import printable
    from string import printable
    from string import printable
    from string import printable
    from string import letters
    from string import digits
    N = len ( printable )
    N %= 30
    map = [ '1' , '2' , '3' , '4' , '5' , '6' ]
    for i in range ( N ) :
        a = map [ i % 5 ]
        b = map [ i % 5 + 1 ]
        map [ i % 5 ] = b
        map [ i % 5 + 1 ] = a
    print ( printable.join ( map ) )
