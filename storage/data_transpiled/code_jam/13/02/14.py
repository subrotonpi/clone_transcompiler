def main ( ) :
    import sys
    from itertools import product
    from itertools import chain
    from itertools import chain
    T = len ( chain ( [ 'A' , 'B' ] , repeat = 1 ) )
    for case_num in chain ( range ( 1 , T + 1 ) , repeat = 1 ) :
        N = len ( chain ( [ 'A' , 'B' ] , repeat = 1 ) )
        M = len ( chain ( [ 'A' , 'B' ] , repeat = 1 ) )
        lawn = [ chain ( [ 'A' , 'B' ] , repeat = 1 ) for _ in range ( N ) ]
        row_max = [ ]
        col_max = [ ]
        for i in range ( N ) :
            row_max.append ( lawn [ i ] [ 0 ] )
            for j in range ( 1 , M ) :
                row_max.append ( max ( row_max [ i ] , lawn [ i ] [ j ] ) )
        for j in range ( M ) :
            col_max.append ( lawn [ 0 ] [ j ] )
            for i in range ( 1 , N ) :
                col_max.append ( max ( col_max [ j ] , lawn [ i ] [ j ] ) )
        possible = True
        outer :
            for i in range ( N ) :
                for j in range ( M ) :
                    if lawn [ i ] [ j ] != min ( row_max [ i ] , col_max [ j ] ) :
                        possible = False
                        break outer
            print ( 'Case #{}: '.format ( case_num ) , end = '' )
            if possible :
                print ( 'YES' )
            else :
                print ( 'NO' )
