def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import digits
    S = digits.letters
    x = ""
    num1 = 0
    num2 = 0
    for i in range ( len ( S ) ) :
        if ( S [ i ] == "A" or S [ i ] == "T" or S [ i ] == "G" or S [ i ] == "C" ) :
            x += "a"
        else :
            x += "b"
    for i in range ( len ( S ) ) :
        if x [ i ] == "a" :
            num1 += 1
            if i == ( len ( S ) - 1 ) :
                if num2 < num1 :
                    num2 = num1
        else :
            if num2 < num1 :
                num2 = num1
            num1 = 0
    print ( num2 )
