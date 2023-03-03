def main ( ) :
    import sys
    from string import ascii_letters
    import string
    S = ascii_letters.replace ( '' , '' )
    flag1 = False
    flag2 = False
    flag3 = False
    for letter in S :
        if letter in [ 'i' , 'I' ] :
            flag1 = True
        if flag1 == True and ( letter in [ 'c' , 'C' ] ) :
            flag2 = True
        if flag2 == True and ( letter in [ 't' , 'T' ] ) :
            flag3 = True
    if flag3 :
        print ( "YES" )
    else :
        print ( "NO" )
