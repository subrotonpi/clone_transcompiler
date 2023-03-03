def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    a , b , c = sc.next ( )
    d = int ( c )
    for i in range ( d / 2 ) :
        if i * i == d :
            print ( "Yes" )
            return
    print ( "No" )
    sc.close ( )
