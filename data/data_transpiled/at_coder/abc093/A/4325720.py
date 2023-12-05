def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    input = sc.next ( )
    a_found = b_found = c_found = c_found = False
    for i in range ( 3 ) :
        if input [ i ] == 'a' :
            a_found = True
        elif input [ i ] == 'b' :
            b_found = True
        else :
            c_found = True
    if a_found and b_found and c_found :
        print ( 'Yes' )
    else :
        print ( 'No' )
