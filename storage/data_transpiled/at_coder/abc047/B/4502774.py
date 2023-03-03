def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    w , h , n = choice ( range ( n ) )
    area = [ [ False for x in range ( h ) ] for y in range ( n ) ]
    for x , y , a in solve ( range ( n ) ) :
        if a == 1 :
            for y1 in range ( h ) :
                for x1 in range ( x ) :
                    area [ y1 ] [ x1 ] = True
        elif a == 2 :
            for y1 in range ( h ) :
                for x1 in range ( x ) :
                    area [ y1 ] [ x1 ] = True
        elif a == 3 :
            for y1 in range ( y ) :
                for x1 in range ( w ) :
                    area [ y1 ] [ x1 ] = True
        elif a == 4 :
            for y1 in range ( y ) :
                for x1 in range ( w ) :
                    area [ y1 ] [ x1 ] = True
    ans = 0
    for is_list in area :
        for is_cell in is_list :
            if not ( is_cell ) :
                ans += 1
    print ( ans )
