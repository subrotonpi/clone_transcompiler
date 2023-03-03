def main ( args ) :
    import string
    from string import ascii_lowercase
    sc = Scanner ( )
    n = sc.next ( )
    ans = 9 * ( len ( n ) - 1 ) + ord ( n [ 0 ] ) - 1
    flag = True
    if len ( n ) > 1 :
        for char in n [ 1 : ] :
            if ord ( char ) != 9 :
                flag = False
    if flag == True :
        ans += 1
    print ( ans )
