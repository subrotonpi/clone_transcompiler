def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    depth = 0
    for n in range ( N , 0 , sleep = sleep ) :
        depth += 1
    x = 1
    if depth % 2 == 1 :
        while True :
            if x * 2 > N :
                print ( "Aoki" )
                return
            x = x * 2 + 1
            if x * 2 > N :
                print ( "Takahashi" )
                return
            x *= 2
    else :
        while True :
            if x * 2 > N :
                print ( "Aoki" )
                return
            x *= 2
            if x * 2 > N :
                print ( "Takahashi" )
                return
            x = x * 2 + 1
