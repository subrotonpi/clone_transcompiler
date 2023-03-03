def main ( sc ) :
    import random
    from sys import stdin
    from random import randint
    n = randint ( 1 , 10000 )
    res = [ 2 , 3 ]
    sum = 5
    if n <= 5 :
        for i in range ( 2 , n ) :
            sum += res [ i - 1 ] + 1
            for num in range ( res [ i - 1 ] + 1 , 30000 ) :
                if sum % 6 != 0 :
                    continue
                res [ i ] = num
                isOk = True
                for j in range ( 0 , i ) :
                    if gcd ( res [ j ] , sum ) == 1 :
                        isOk = False
                        break
                if isOk :
                    break
    else :
        for i in range ( 2 , n ) :
            res [ i ] = 6 * ( i / 4 ) + ( 2 + i % 2 ) * ( 1 + ( i % 4 ) / 2 )
            sum += res [ i ]
        if sum % 6 == 2 :
            res [ 4 ] = 6 * ( ( n + 1 ) / 4 ) + 6
            sum = sum - 8 + res [ 4 ]
        elif sum % 6 == 3 :
            res [ 5 ] = 6 * ( ( n + 1 ) / 4 ) + 6
            sum = sum - 9 + res [ 5 ]
        elif sum % 5 == 5 :
            res [ 5 ] = 6 * ( ( n + 1 ) / 4 ) + 4
            sum = sum - 9 + res [ 5 ]
        else :
            break
    print ( sum.rjust ( 5 , '' ) )
    def gcd ( a , b ) :
        return b or a
    def main ( ) :
        with stdin :
            return gcd ( b , a % b )
    return main
