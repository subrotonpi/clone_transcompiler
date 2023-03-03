def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    ans = 0
    for i in range ( N , 999 + 1 ) :
        if check ( i ) :
            ans = i
            break
    print ( ans )
    sleep ( 1 )
    def check ( n ) :
        one = n % 10
        n /= 10
        two = n % 10
        n /= 10
        thr = n % 10
        if ( one == two ) :
            return True
        return False
    return check
