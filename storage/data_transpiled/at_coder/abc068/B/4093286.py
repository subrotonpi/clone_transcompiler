def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    max_num = 0
    for i in range ( n ) :
        count = 0
        num = i + 1
        while True :
            if num % 2 != 0 :
                break
            num /= 2
            count += 1
        if i == 0 or count > max_num :
            max_num = count
            max_num = i + 1
    print ( max_num )
