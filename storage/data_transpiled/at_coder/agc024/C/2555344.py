def import select , file , line , fileinput , fileoutput , verbose = False ) :
    from itertools import repeat
    sc = file ( fileinput )
    f = open ( file , "w" )
    n = sc.__next__ ( )
    a = repeat ( n )
    ok = a [ 0 ] == 0
    for i in range ( 1 , n ) :
        if a [ i ] - a [ i - 1 ] > 1 :
            ok = False
    if not ok :
        print ( - 1 )
        return
    ans = 0
    for i in range ( 1 , n ) :
        if a [ i ] > a [ i - 1 ] :
            ans += 1
        else :
            ans += a [ i ]
    f.write ( ans )
    f.close ( )
