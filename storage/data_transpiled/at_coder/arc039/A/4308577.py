def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    a = sc.next ( )
    b = sc.next ( )
    max = int ( a ) - int ( b )
    for i in range ( 3 ) :
        arr = a.split ( '.' )
        arr [ i ] = digits [ i ]
        v = int ( ''.join ( arr ) ) - int ( b )
        if max < v :
            max = v
    for i in range ( 3 ) :
        arr = b.split ( '.' )
        if i == 0 :
            arr [ i ] = '1'
        else :
            arr [ i ] = '0'
        v = int ( a ) - int ( ''.join ( arr ) )
        if max < v :
            max = v
    print ( max )
