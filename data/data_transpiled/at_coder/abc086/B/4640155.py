def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    a = sc.next ( )
    b = sc.next ( )
    sq = int ( a.lstrip ( ) )
    for i in range ( 2 , sq / 2 ) :
        if i * i == sq :
            print ( "Yes" )
            return
    print ( "No" )
