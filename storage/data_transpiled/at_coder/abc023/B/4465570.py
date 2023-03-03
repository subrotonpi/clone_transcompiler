def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    n = sc.next ( )
    data = sc.next ( )
    if n % 2 == 0 :
        print ( - 1 )
        return
    tmp = data [ 0 ]
    for i in range ( 1 , n ) :
        if tmp == 'a' :
            if data [ i ] != 'b' :
                print ( '-1' )
                return
        elif tmp == 'b' :
            if data [ i ] != 'c' :
                print ( '-1' )
                return
        elif tmp == 'c' :
            if data [ i ] != 'a' :
                print ( '-1' )
                return
        if i == ( n - 1 ) / 2 :
            if data [ i ] != 'b' :
                print ( '-1' )
                return
        tmp = data [ i ]
    print ( ( n - 1 ) / 2 )
