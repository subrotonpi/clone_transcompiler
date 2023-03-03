def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sin , cos , cos , log
    with open ( '/proc/' , 'r' ) as sc :
        num = randint ( 1 , 5 )
        result = 500000
        for i in range ( num ) :
            next_num = randint ( 1 , 5 )
            count = 0
            while next_num % 2 == 0 :
                count += 1
                next_num /= 2
            result = min ( result , count )
        print ( result )
        sc.close ( )
