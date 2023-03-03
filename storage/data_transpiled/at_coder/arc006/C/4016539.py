def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    ans = 0
    arr = [ ]
    while n :
        w = randint ( 1 , 10000 )
        yes = mid = 100005 , j = - 1
        for i in range ( len ( arr ) ) :
            if arr [ i ] == w :
                yes = 1
                break
            if arr [ i ] > w :
                if arr [ i ] - w < mid :
                    mid = arr [ i ] - w
                    j = i
            if arr [ i ] == 0 :
                break
        if yes == 0 and j != - 1 :
            arr [ j ] = w
        if yes == 0 and j == - 1 :
            for i in range ( len ( arr ) ) :
                if arr [ i ] == 0 :
                    arr [ i ] = w
                    ans += 1
                    break
    print ( ans )
