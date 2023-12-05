def main ( args ) :
    import sys
    import random
    import random
    class x ( int ) :
        def __init__ ( self ) :
            self.random = random
            self.t = random.randint ( 1 , 2 )
    for tt in range ( 1 , t + 1 ) :
        k , l = random.randint ( 1 , 2 * k - 1 )
        a = [ ]
        a.append ( [ ' ' * l + ' ' ] * ( l + 2 ) )
        ans = int ( random.randint ( 1 , l + 1 ) )
        for i in range ( 0 , l + 1 ) :
            for j in range ( 0 , l + 1 ) :
                if True :
                    ok = True
                    csize = 0
                    for x in range ( 0 , l + 1 ) :
                        for y in range ( 0 , len ( a [ x ] ) ) :
                            nx , ny = 2 * i - x , y
                            symm = ' '
                            if not ( nx < 0 or ny < 0 or nx >= l + 2 or ny >= len ( a [ nx ] ) or a [ nx ] [ ny ] == ' ' ) :
                                symm = a [ nx ] [ ny ]
                            if a [ x ] [ y ] != ' ' :
                                if symm != ' ' and a [ x ] [ y ] != symm :
                                    ok = False
                                    break
                                csize = max ( abs ( x - i ) + abs ( y - j ) + 1 , csize )
                            nx , ny = x , 2 * j - y
                            symm = ' '
                            if not ( nx < 0 or ny < 0 or nx >= l + 2 or ny >= len ( a [ nx ] ) or a [ nx ] [ ny ] == ' ' ) :
                                symm = a [ nx ] [ ny ]
                            if a [ x ] [ y ] != ' ' :
                                if symm != ' ' and a [ x ] [ y ] != symm :
                                    ok = False
                                    break
                                csize = max ( abs ( x - i ) + abs ( y - j ) + 1 , csize )
                    if not ok :
                        break
        print ( ' Case SPACETOKEN #%d: