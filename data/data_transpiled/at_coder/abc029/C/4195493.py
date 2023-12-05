def main ( ) :
    import sys
    from string import printable
    from string import printable
    from string import digits
    from string import letters
    from string import digits
    N = len ( printable )
    zero = ""
    for i in range ( N ) :
        zero += "0"
    for i in range ( pow ( 3 , N ) ) :
        t = zero + str ( i )
        t = t [ - N : ]
        for c in t :
            print ( chr ( ord ( 'a' ) + ord ( c ) ) , end = ' ' )
        print ( )
