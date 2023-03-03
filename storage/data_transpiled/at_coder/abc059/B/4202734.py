def main ( srgs ) :
    import string
    from string import letters
    from string import digits
    a = digits.letters
    b = digits.letters
    if len ( a ) < len ( b ) :
        print ( "LESS" )
    elif len ( a ) > len ( b ) :
        print ( "GREATER" )
    else :
        for i in range ( 0 , len ( a ) + 1 ) :
            if i == len ( a ) :
                print ( "EQUAL" )
                break
            cha = a [ i ]
            chb = b [ i ]
            A = digits.letters [ cha ]
            B = digits.digits [ chb ]
            if A > B :
                print ( "GREATER" )
                break
            elif A < B :
                print ( "LESS" )
                break
