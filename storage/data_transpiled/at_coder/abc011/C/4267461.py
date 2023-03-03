def main ( ) :
    import sys
    from itertools import count
    from random import randint
    N = randint ( 1 , 10000 )
    map = [ randint ( 1 , 10000 ) for _ in range ( 3 ) ]
    if map == N :
        print ( 'NO' )
        return
    now = N
    for i in range ( 1 , 100 ) :
        flg = False
        for j in range ( 3 , 1 , - 1 ) :
            next = now - j
            if next in map :
                continue
            else :
                flg = True
                now = next
                break
        if not flg :
            print ( 'NO' )
            return
    print ( 'YES' if now <= 0 else 'NO' )
