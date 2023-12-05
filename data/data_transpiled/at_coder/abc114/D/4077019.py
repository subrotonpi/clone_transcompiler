def main ( ) :
    import sys
    from itertools import count
    n = int ( sys.stdin.readline ( ) )
    num = [ 0 ] * 101
    for i in range ( 2 , n + 1 ) :
        tmp = i
        for j in range ( 2 , i + 1 ) :
            while tmp % j == 0 :
                num [ j ] += 1
                tmp /= j
    ans = 0
    ans += count ( 74 , num )
    ans += count ( 24 , num ) * ( count ( 2 , num ) - 1 )
    ans += count ( 14 , num ) * ( count ( 4 , num ) - 1 )
    ans += count ( 4 , num ) * ( count ( 4 , num ) - 1 ) * ( count ( 2 , num ) - 2 ) / 2
    print ( ans )
    def count ( a , num ) :
        count = 0
        for i in range ( 2 , n + 1 ) :
            if num [ i ] >= a :
                count += 1
        return count
    return count
