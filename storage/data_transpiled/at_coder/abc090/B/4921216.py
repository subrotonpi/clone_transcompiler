def __main__ ( ) :
    import sys
    from os import getenv
    input = sys.stdin
    args = input.split ( )
    a = int ( args [ 0 ] )
    b = int ( args [ 1 ] )
    count = 0
    for i in range ( a , b + 1 ) :
        if __blandrome ( i ) :
            count += 1
    print ( count )
    def __blandrome ( n ) :
        copy = n
        new_n = 0
        while n > 9 :
            new_n = new_n * 10 + ( n % 10 )
            n /= 10
        if n > 0 :
            new_n = new_n * 10 + ( n % 10 )
        return new_n == copy
    return __blandrome
