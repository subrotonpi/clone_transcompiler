def main ( ) :
    import sys
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            import random
            N = random.randint ( 1 , N - 1 )
            c = [ random.randint ( 1 , N - 1 ) for i in range ( N - 1 ) ]
            S = [ random.randint ( 1 , N - 1 ) for i in range ( N - 1 ) ]
            F = [ random.randint ( 1 , N - 1 ) for i in range ( N - 1 ) ]
            for i in range ( N ) :
                at = [ ]
                dt = [ ]
                if i == N - 1 :
                    dt.append ( 0 )
                else :
                    dt.append ( S [ i ] )
                for j in range ( i + 1 , N ) :
                    at.append ( dt [ j - 1 ] + c [ j - 1 ] )
                    if j < N - 1 :
                        dt.append ( ( at [ j ] < S [ j ] ) + F [ j ] * roundUp ( at [ j ] - S [ j ] , F [ j ] ) )
                print ( at [ N - 1 ] )
    def roundUp ( a , b ) :
        res = a // b
        if a % b == 0 :
            return res
        else :
            return res + 1
    return main
