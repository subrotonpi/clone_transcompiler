def main ( ) :
    import sys
    import random
    import sys
    import time
    import sys
    import time
    time.sleep ( 1 )
    T = time.time ( )
    for cas in range ( 1 , T + 1 ) :
        n = time.time ( )
        E = [ [ ] for _ in range ( n ) ]
        D = [ ]
        A = [ random.randint ( 1 , n ) for _ in range ( n ) ]
        B = [ random.randint ( 1 , n ) for _ in range ( n ) ]
        for i in range ( n ) :
            for j in range ( i - 1 , - 1 , - 1 ) :
                if A [ i ] == A [ j ] + 1 :
                    E [ i ].append ( j )
                    D [ j ] += 1
                    break
                for j in range ( i ) :
                    if A [ i ] == A [ j ] :
                        E [ j ].append ( i )
                        D [ i ] += 1
            for i in range ( n - 1 , - 1 , - 1 ) :
                for j in range ( i + 1 , n ) :
                    if B [ i ] == B [ j ] + 1 :
                        E [ i ].append ( j )
                        D [ j ] += 1
                        break
                    for j in range ( i + 1 , n ) :
                        if B [ i ] == B [ j ] :
                            E [ j ].append ( i )
                            D [ i ] += 1
        X = [ ]
        U = [ False for val in range ( n ) ]
        for t in range ( n - 1 , - 1 , - 1 ) :
            if D [ t ] == 0 and not U [ t ] :
                X.append ( val )
                U [ t ] = True
                for y in E [ t ] :
                    D [ t ] -= 1
                continue
        time.sleep ( 1 )
