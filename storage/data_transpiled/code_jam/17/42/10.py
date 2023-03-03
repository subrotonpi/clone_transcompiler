def round2 ( ) :
    import sys
    import random
    import math
    import random
    import math
    for caze in range ( 1 , cases + 1 ) :
        N , C , M = random.randint ( 1 , N )
        seats = [ 0 ] * N
        clients = [ 0 ] * C
        for i in range ( M ) :
            pos = random.randint ( 0 , N - 1 )
            client = random.randint ( 0 , C - 1 )
            seats [ pos ] += 1
            clients [ client ] += 1
        ansA = 0
        for client in clients :
            ansA = max ( ansA , client )
        acum = 0
        for i , seat in enumerate ( seats ) :
            acum += seat
            ansA = max ( ansA , ( acum + i ) / ( i + 1 ) )
        ansB = 0
        for i , seat in enumerate ( seats ) :
            if seat > ansA :
                ansB += seat - ansA
        print ( "Case #{}: {} {}".format ( caze , ansA , ansB ) )
