def Main ( ) :
    _sys.stdin.write ( '\n' )
    max1 , max2 , max3 , a = 100 , 100 , 100 , [ ]
    for i in range ( 3 ) :
        max1 = min ( max1 , a [ i * 3 ] )
        max2 = min ( max2 , a [ i * 3 + 1 ] )
        max3 = min ( max3 , a [ i * 3 + 2 ] )
    print ( ( a [ 0 ] - max1 == a [ 1 ] - max2 and a [ 1 ] - max2 == a [ 2 ] - max3 ) and ( a [ 3 ] - max1 == a [ 4 ] - max2 and a [ 4 ] - max2 == a [ 5 ] - max3 ) and ( a [ 6 ] - max1 == a [ 7 ] - max2 and a [ 7 ] - max2 == a [ 8 ] - max3 ) )
