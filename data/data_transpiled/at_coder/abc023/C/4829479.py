def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        R = int ( s [ 0 ] )
        C = int ( s [ 1 ] )
        K = int ( s [ 2 ] )
        tate = [ 0 ] * R
        yoko = [ 0 ] * C
        N = int ( sc.readline ( ).rstrip ( ) )
        candy = [ [ 0 ] * ( N + 2 ) for i in range ( N ) ]
        for t in sc.readline ( ).split ( ) :
            candy [ t [ 0 ] ] = int ( t [ 0 ] ) - 1
            candy [ t [ 1 ] ] = int ( t [ 1 ] ) - 1
            tate [ candy [ t [ 0 ] ] ] += 1
            yoko [ candy [ t [ 1 ] ] ] += 1
        tate_K = [ 0 ] * ( K + 1 )
        yoko_K = [ 0 ] * ( K + 1 )
        for i in range ( R ) :
            if tate [ i ] <= K :
                tate_K [ tate [ i ] ] += 1
        for i in range ( C ) :
            if yoko [ i ] <= K :
                yoko_K [ yoko [ i ] ] += 1
        count = 0
        for i in range ( K ) :
            count += int ( tate_K [ i ] * yoko_K [ K - i ] )
        for i in range ( N ) :
            if tate [ candy [ i ] [ 0 ] ] + yoko [ candy [ i ] [ 1 ] ] == K :
                count -= 1
            elif tate [ candy [ i ] [ 0 ] ] + yoko [ candy [ i ] [ 1 ] ] == K + 1 :
                count += 1
        print ( count )
