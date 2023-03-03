def main ( ) :
    import sys
    import time
    import time
    import random
    N = random.randint ( 1 , 5 )
    A = random.randint ( 1 , 5 )
    B = random.randint ( 1 , 5 )
    time = 0
    for i in range ( N ) :
        if i < 5 :
            time = time + B
        else :
            time = time + A
    print ( time )
