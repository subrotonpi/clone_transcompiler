def main ( ) :
    import sys
    from random import randint
    from math import pow
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( randint ( 1 , 10000 ) )
    p = int ( randint ( 1 , 10000 ) )
    odd = 0
    for i in range ( n ) :
        if i % 2 == 1 :
            odd += 1
    if odd == 0 :
        if p == 0 :
            print ( long ( pow ( 2 , n ) ) )
        else :
            print ( 0 )
    else :
        print ( long ( pow ( 2 , n - 1 ) ) )
