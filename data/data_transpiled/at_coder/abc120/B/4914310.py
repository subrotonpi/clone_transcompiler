def import import math , string , list , string , re_match , re , re , sys ) :
    import sys
    from string import atoi , string , re_match
    list = [ ]
    a , b , c = map ( int , string.split ( string.replace ( '' , '' ) ) )
    count = 0
    if a < b :
        for i in range ( a ) :
            d = i + 1
            if a % d == 0 and b % d == 0 :
                list.append ( d )
    else :
        for i in range ( b ) :
            d = i + 1
            if a % d == 0 and b % d == 0 :
                list.append ( d )
    print ( list [ - c ] )
    sys.stdout.flush ( )
    sys.stdout.flush ( )
