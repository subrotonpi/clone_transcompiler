def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    n = len ( chain ( sys.stdin.readline ( ).strip ( ).split ( ) ) )
    a = chain ( chain ( a , repeat ( n ) ) )
    b = [ ]
    for i in range ( n ) :
        taka = 0
        aoki = sys.maxint
        tmp = 0
        ao = 0
        for j in range ( n ) :
            if i == j :
                continue
            elif i < j :
                tmp , ao = culc ( i , j )
            else :
                tmp , ao = culc ( j , i )
            if aoki < ao :
                aoki = ao
                taka = tmp
        b.append ( taka )
    b.sort ( )
    print ( b [ - 1 ] )
    sys.stdout.write ( '\n' )
