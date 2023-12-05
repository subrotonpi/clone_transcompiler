def main ( ) :
    import sys
    from os.path import join
    f = open ( 'A-large.in' , 'r' )
    f = open ( 'solve.txt' , 'w' )
    T = int ( f.readline ( ).strip ( ) )
    for i in range ( 1 , T + 1 ) :
        s = f.readline ( ).strip ( ).split ( )
        S = s [ 0 ]
        K = int ( s [ 1 ] )
        S = S [ 2 : ]
        num = 0
        ok = True
        data = [ 0 ] * len ( S )
        for j in range ( 0 , len ( S ) - K + 1 ) :
            if ( S [ j ] == '-' and data [ j ] % 2 == 0 ) or ( S [ j ] == '+' and data [ j ] % 2 == 1 ) :
                num += 1
                for k in range ( 1 , K ) :
                    data [ j + k ] += 1
        for j in range ( len ( S ) - K + 1 , len ( S ) ) :
            if ( S [ j ] == '-' and data [ j ] % 2 == 0 ) or ( S [ j ] == '+' and data [ j ] % 2 == 1 ) :
                ok = False
                break
        f.write ( 'Case #%d: ' % i )
        if ok :
            f.write ( '%d\n' % num )
        else :
            f.write ( 'IMPOSSIBLE\n' )
    f.close ( )
    os.remove ( 'solve.txt' )
    return
