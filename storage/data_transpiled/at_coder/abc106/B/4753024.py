def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from random import randint
    from random import choice
    N , cnt , sum = 0 , 0 , 0
    N = randint ( 1 , randint ( 1 , 1 ) )
    for i in range ( randint ( 1 , N + 1 ) ) :
        if i % 2 :
            cnt = 0
            for k in range ( randint ( 1 , N + 1 ) ) :
                if i % k == 0 :
                    cnt += 1
            if cnt == 8 :
                sum += 1
    print ( sum )
    sys.exit ( sum )
