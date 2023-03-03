def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    S = sc.next ( )
    o1 = S [ 0 ] == 'A'
    o3 = True
    for i in S [ 1 : ] :
        if i != 'C' and i.isupper ( ) :
            o3 = False
            break
    cnt = 0
    o2 = True
    if S [ 0 ] == 'C' or S [ 1 ] == 'C' or S [ - 1 ] == 'C' :
        o2 = False
    else :
        for i in S :
            if i == 'C' :
                cnt += 1
        if cnt != 1 :
            o2 = False
    if o1 and o2 and o3 :
        print ( 'AC' )
    else :
        print ( 'WA' )
