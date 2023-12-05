def main ( ) :
    import sys
    from random import randint
    from time import sleep
    with open ( '/proc/sys/stdin' , 'r' ) as sc :
        num = randint ( 1 , 10000 )
        have = randint ( 1 , 10000 )
        want = [ randint ( 1 , 10000 ) for _ in range ( num ) ]
        want.sort ( )
        ans = 0
        tmp = 0
        for i in range ( num ) :
            tmp += want [ i ]
            if tmp <= have :
                ans += 1
            else :
                break
            if i == num - 1 and tmp < have :
                ans -= 1
                break
        print ( ans )
