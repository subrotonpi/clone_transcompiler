def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    s = sc.next ( )
    while not s == "" :
        char = s [ 0 ]
        count = 0
        for i in s :
            if i == char :
                count += 1
        if count % 2 == 1 :
            print ( "No" )
            sc.close ( )
            return
        s = re.sub ( char , "" , s )
    print ( "Yes" )
    sc.close ( )
