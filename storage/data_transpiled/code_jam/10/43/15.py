def main ( arg ) :
    import sys
    from numpy.linalg import solve
    with open ( '../data/data/C.txt' , 'r' ) as sc :
        T = int ( sc.readline ( ) )
        for ii in range ( 1 , T + 1 ) :
            R = solve ( sc )
            G = [ [ ] for i in range ( 101 ) ]
            for X1 , Y1 , X2 , Y2 in solve ( sc ) :
                for y in range ( Y1 , Y2 + 1 ) :
                    for x in range ( X1 , X2 + 1 ) :
                        G [ y ] [ x ] = 1
            changed = True
            cnt = 0
            while changed :
                changed = False
                G2 = [ ]
                for j in range ( 1 , 101 ) :
                    G2.append ( [ ( G [ 0 ] [ j - 1 ] == 1 and G [ 0 ] [ j ] == 1 ) , ( G [ i ] [ j ] == 1 and G [ i ] [ j ] == 1 ) ] )
                for i in range ( 1 , 101 ) :
                    G2.append ( [ ( G [ i - 1 ] [ 0 ] == 1 and G [ i ] [ 0 ] == 1 ) , ( G [ i ] [ j ] == 1 and G [ i ] [ j ] == 1 ) ] )
                if len ( G2 ) == 0 and len ( G2 ) == 0 :
                    G2 [ i ] [ j ] = 0
            for i in range ( len ( G ) ) :
                for j in range ( len ( G2 ) ) :
                    if G2 [ i ] [ j ] != G [ i ] [ j ] :
                        changed = True
                    G = G2
                    cnt += 1
            print ( 'Case #%d: %s\n' % ( ii , ( cnt - 1 ) ) )
