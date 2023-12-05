def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    s = sc.read ( )
    sc.close ( )
    l = len ( s )
    if l == 26 :
        p = [ s [ i ] - 'a' for i in range ( l ) ]
        if next_permutation ( p ) :
            for i in range ( 26 ) :
                if s [ i ] - 'a' == p [ i ] :
                    print ( s [ i ] , end = ' ' )
                else :
                    print ( chr ( p [ i ] + 'a' ) )
                    break
        else :
            print ( - 1 )
    else :
        a = [ 0 ] * 26
        for i in range ( l ) :
            a [ s [ i ] - 'a' ] += 1
        for i in range ( 26 ) :
            if a [ i ] == 0 :
                print ( s , end = ' ' )
                print ( chr ( i + 'a' ) )
                break
    def next_permutation ( p ) :
        for a in range ( len ( p ) - 2 , - 1 , - 1 ) :
            if p [ a ] < p [ a + 1 ] :
                for b in range ( len ( p ) - 1 , - 1 , - 1 ) :
                    if p [ b ] > p [ a ] :
                        t = p [ a ]
                        p [ a ] , p [ b ] = p [ b ] , t
                        for a , b in zip ( p [ a + 1 : ] , p [ b + 1 : ] ) :
                            t = p [ a ]
                            p [ a ] , p [ b ] = p [ b + 1 : ] , t
                        return True
        return False
