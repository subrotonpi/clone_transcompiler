def main ( ) :
    import sys
    from time import sleep
    from math import ceil
    from math import log
    from math import log
    from math import log
    from math import log
    from math import factorial
    N = int ( sys.stdin.read ( ) )
    num_divisor = [ 0 ] * 1001
    for i in range ( 2 , N + 1 ) :
        divisor = 2
        i2 = i
        while i2 != 1 :
            while i2 % divisor == 0 :
                i2 /= divisor
                num_divisor [ divisor ] += 1
            divisor += 1
    ans = 1
    for i in range ( 2 , N + 1 ) :
        if num_divisor [ i ] != 0 :
            ans = ( ans * ( num_divisor [ i ] + 1 ) ) % 1000000007
    print ( ans )
