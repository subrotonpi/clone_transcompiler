def main ( ) :
    import sys
    from random import randint
    sc = open ( "/proc/stuples/" , "r" )
    n = sc.read ( )
    sc.close ( )
    ng = [ ]
    for i in range ( 3 ) :
        ng.append ( sc.read ( ) )
        sc.close ( )
    count = 0
    tmp = n
    if not ( n in ng or ( n in ng or ng [ 2 ] ) ) :
        while count <= 100 :
            if tmp != 0 :
                count += 1
            else :
                print ( "YES" )
                break
            tmp = tmp - 3
            if not ( tmp in ng or ( tmp in ng or tmp in ng ) ) and tmp >= 0 :
                continue
            tmp = tmp + 1
            if not ( tmp in ng or ( tmp in ng or tmp in ng ) ) and tmp >= 0 :
                continue
            tmp = tmp + 1
            if not ( tmp in ng or ( tmp in ng or tmp in ng ) ) and tmp >= 0 :
                continue
            else :
                print ( "NO" )
                break
    else :
        print ( "NO" )
    if count > 100 :
        print ( "NO" )
