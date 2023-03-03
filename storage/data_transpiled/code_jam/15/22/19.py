def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = 0
        def solve ( self ) :
            with open ( "input.txt" , "r" ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    Row = cin.read ( )
                    Col = cin.read ( )
                    Num = cin.read ( )
                    print ( "Case #{}: {}".format ( C , solve ( Row , Col , Num ) ) )
        def solve ( R , C , N ) :
            all = [ ]
            all2 = [ ]
            for i in range ( R ) :
                for j in range ( C ) :
                    wall = 0
                    if i > 0 :
                        wall += 1
                    if j > 0 :
                        wall += 1
                    if i + 1 < R :
                        wall += 1
                    if j + 1 < C :
                        wall += 1
                    if ( i + j ) % 2 == 0 :
                        all.append ( wall )
                    else :
                        all2.append ( wall )
        ret = 0
        all.sort ( )
        for i in range ( len ( all ) - ( R * C - N ) ) :
            ret += all [ i ]
        ret2 = 0
        all2.sort ( )
        for i in range ( len ( all2 ) - ( R * C - N ) ) :
            ret2 += all2 [ i ]
        return min ( ret , ret2 )
    return Main
