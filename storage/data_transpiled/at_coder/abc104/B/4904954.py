def main ( args ) :
    import sys
    from string import ascii_lowercase
    sc = open ( 'test.txt' , 'r' )
    str = sc.read ( )
    L = len ( str )
    cnt = 0
    check = True
    for i in range ( L ) :
        if i == 0 :
            if str [ i ] != 'A' :
                check = False
        elif 2 <= i <= L - 2 :
            if str [ i ] == 'C' :
                cnt += 1
            elif 'A' <= str [ i ] <= 'Z' :
                check = False
        else :
            if 'A' <= str [ i ] <= 'Z' :
                check = False
    if cnt != 1 :
        check = False
    if check :
        print ( 'AC' )
    else :
        print ( 'WA' )
