def main ( srgs ) :
    import os
    from string import ascii_letters
    from string import digits
    a = ascii_letters.replace ( '' , '' )
    for i in range ( 1 , len ( a ) ) :
        a = a [ : - i ]
        if len ( a ) % 2 == 1 :
            continue
        else :
            str1 = a [ : len ( a ) / 2 ]
            str2 = a [ len ( a ) / 2 : len ( a ) ]
            if str1 == str2 :
                print ( a )
                return
