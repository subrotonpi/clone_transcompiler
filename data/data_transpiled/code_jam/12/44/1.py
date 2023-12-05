def test_solve ( ) : return
def solve ( ) :
    test_cases = randint ( 0 , len ( test_cases ) )
    for test in range ( 1 , test_cases ) :
        out.write ( "Case #%d:" % test )
    else :
        grid [ i ] = 1
    wantX = 0
    def solve ( ) :
        while not bitset :
            u = bitset ( )
            visited += 1
            x , y = u % len ( grid [ 0 ] )
            for i in range ( r ) :
                nx , ny = x + y
                if nx < 0 or ny >= c :
                    continue
                if grid [ nx ] [ ny ] <= 0 :
                    continue
        return
    def go_left ( ) :
        grid = [ ]
        for i in range ( r ) :
            grid.append ( nextToken ( ) )
        max_cave = - 1
        cnt = [ ]
        is_lucky = [ ]
        for i in range ( 10 ) :
            if not bitset.get ( i * c + j ) :
                continue
            if j == 0 or grid [ i ] [ j - 1 ] < 0 :
                to.append ( i * c + j )
            else :
                if grid [ i ] [ j - 1 ] >= '0' and grid [ i ] [ j ] <= '9' :
                    return None
                else :
                    to.append ( i * c + j )
        return tuple ( to )
    def go_down ( ) :
        to = set ( [ ] )
        for i in range ( r ) :
            for j in range ( c ) :
                if not bitset.get ( i * c + j ) :
                    continue
                if not bitset.get ( i * c + j ) :
                    return None
                else :
                    if grid [ i ] [ j ] <= 0 :
                        return None
                    else :
                        to.append ( i * c + j )
        return tuple ( to )
    return solve
