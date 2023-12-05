def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    n = len ( chain ( sys.stdin.readline ( ).strip ( ).split ( ) ) )
    a = [ ]
    b = [ ]
    if n % 2 == 0 :
        for i in range ( 1 , n + 1 ) :
            for j in range ( i + 1 , n + 1 ) :
                if i != j and j != n - i + 1 :
                    a.append ( i )
                    b.append ( j )
    else :
        for i in range ( 1 , n + 1 ) :
            for j in range ( i + 1 , n + 1 ) :
                if i != j and j != n - i :
                    a.append ( i )
                    b.append ( j )
    print ( len ( a ) )
    for i , j in zip ( a , b ) :
        print ( i , j )
