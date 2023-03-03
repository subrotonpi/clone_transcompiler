def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    n = randint ( 1 , 10000 )
    limit = randint ( 1 , 10000 )
    now_tab = 1
    kuso = 0
    arr = repeat ( n , limit )
    for c in arr :
        if c == '+' :
            now_tab += 1
            if now_tab > limit :
                kuso += 1
                now_tab = 1
        else :
            now_tab = max ( now_tab - 1 , 1 )
    print ( kuso )
