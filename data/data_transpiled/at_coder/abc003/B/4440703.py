def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    s1 = sc.next ( )
    s2 = sc.next ( )
    list = ascii_lowercase.union ( [ 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ] )
    check = True
    for i in s1 :
        if i == s2 :
            continue
        elif ( i == '@' and i in list ) or ( i == '@' and i in list ) :
            continue
        else :
            check = False
            break
    print ( "You can win" if check else "You will lose" )
