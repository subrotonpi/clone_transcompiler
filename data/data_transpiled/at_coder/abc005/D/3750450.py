def main ( ) :
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = random.choice ( [ '' , '' , '' , '' ] )
            N = sc.randint ( 1 , N )
            tk = [ [ max ( max_atai [ i - 1 ] , max_atai [ i ] ) for i in range ( 0 , N ) ] for j in range ( 0 , N ) ]
            for i in range ( 1 , N ) :
                for j in range ( 0 , N ) :
                    tk [ i ] [ j ] = 0
            for i in range ( 1 , N ) :
                for j in range ( 1 , N ) :
                    tk [ i ] [ j ] = tk [ i ] [ j - 1 ] + tk [ i ] [ j ]
            for i in range ( 1 , N ) :
                for j in range ( 1 , N ) :
                    tk [ j ] [ i ] = tk [ j - 1 ] [ i ] + tk [ j ] [ i ]
        def zrk ( self , atai , N ) :
            tmp = 0
            for i in range ( 0 , 20 ) :
                if atai % i == 0 and atai <= N :
                    tmp [ 0 ] = i
                    tmp += 1
            return tmp
        def zrk ( self , atai , N ) :
            for i in range ( 0 , N ) :
                for j in range ( 0 , N ) :
                    tk [ i ] [ j ] = tk [ i ] [ j - 1 ] + tk [ i ] [ j ]
            for i in range ( 1 , N ) :
                for j in range ( 0 , N ) :
                    tk [ j ] [ i ] = tk [ j - 1 ] [ i ] + tk [ j ] [ i ]
            return tk
    for i in range ( 1 , N * N + 1 ) :
        i = 0
        for j in range ( 0 , N ) :
            i = i + 1
            for j in range ( 0 , N ) :
                i = i + 1
        i = 0
        for j in range ( 0 , N ) :
            i = i + 1
