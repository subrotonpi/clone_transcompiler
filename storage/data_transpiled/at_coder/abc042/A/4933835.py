def main ( ) :
    import sys
    from string import ascii_letters
    with open ( 'input.txt' , 'r' ) as sc :
        s = sc.read ( )
    s_list = s.split ( )
    five = 0
    seven = 0
    for i in range ( 3 ) :
        if s_list [ i ] == '5' :
            five += 1
        elif s_list [ i ] == '7' :
            seven += 1
    if five == 2 and seven == 1 :
        print ( 'YES' )
    else :
        print ( 'NO' )
