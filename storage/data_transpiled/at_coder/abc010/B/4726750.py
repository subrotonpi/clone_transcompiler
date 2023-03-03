def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    with open ( "test.txt" , "r" ) as sc :
        N = randint ( 1 , 5 )
        ans = 0
        for i in range ( N ) :
            a = sin ( i )
            if a == 5 :
                ans += 2
            elif a % 2 == 0 :
                ans += 1
                a -= 1
                if a == 5 :
                    ans += 2
        print ( ans )
