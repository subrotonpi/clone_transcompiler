def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    sc = open ( "/proc/stuples/" , "r" )
    n = sc.__next__ ( )
    sc.close ( )
    ng = chain ( [ n ] , [ n ] )
    count = 0
    tmp = n
    if not ( n in ng ) :
        while count <= 100 :
            if tmp > 0 :
                count += 1
            else :
                print ( "YES" )
                break
            tmp = tmp - 3
            if not ( tmp in ng ) :
                continue
            tmp = tmp + 1
            if not ( tmp in ng ) :
                continue
            tmp = tmp + 1
            if not ( tmp in ng ) :
                continue
            else :
                print ( "NO" )
                break
    else :
        print ( "NO" )
    if count > 100 :
        print ( "NO" )
