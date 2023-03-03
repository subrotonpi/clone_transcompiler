def main ( ) :
    import sys
    from string import ascii_lowercase
    with open ( 'input.txt' , 'r' ) as f :
        InStr = f.read ( )
    AryStr = InStr.split ( )
    cnt5 = 0
    cnt7 = 0
    i = 0
    while i <= 2 :
        if AryStr [ i ] == '5' :
            cnt5 += 1
        if AryStr [ i ] == '7' :
            cnt7 += 1
        i += 1
    if cnt5 == 2 and cnt7 == 1 :
        print ( 'YES' )
    else :
        print ( 'NO' )
