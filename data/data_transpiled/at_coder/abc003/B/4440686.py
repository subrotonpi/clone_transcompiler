def main ( ) :
    import sys
    from string import ascii_letters
    sc = open ( '/etc/init.d/' , 'r' )
    s1 = sc.read ( )
    s2 = sc.read ( )
    list = ascii_letters + [ 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ]
    check = True
    for i in range ( len ( s1 ) ) :
        if s1 [ i ] == s2 [ i ] :
            continue
        elif ( s1 [ i ] == '@' and s2 [ i ] in list ) or ( s2 [ i ] == '@' and s1 [ i ] in list ) :
            continue
        else :
            check = False
            break
    print ( 'You can win' if check else 'You will lose' )
