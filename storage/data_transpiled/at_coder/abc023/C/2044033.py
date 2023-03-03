def main ( ) :
    import sys
    from random import randint
    r , c , k , n = randint ( 1 , 10000 ) , randint ( 1 , 10000 ) , randint ( 1 , 10000 )
    rc = [ ]
    cc = [ ]
    for i in range ( n ) :
        rc.append ( randint ( - 1 , 1 ) )
        cc.append ( randint ( - 1 , 1 ) )
    ans = solve ( )
    print ( ans )
    def solve ( ) :
        candy_in_r = [ 0 ] * ( r + 1 )
        candy_in_c = [ 0 ] * ( c + 1 )
        for i in range ( n ) :
            candy_in_r [ rc [ i ] ] += 1
            candy_in_c [ cc [ i ] ] += 1
        count_r = [ 0 ] * ( n + 1 )
        count_c = [ 0 ] * ( n + 1 )
        for i in range ( r ) :
            count_r [ candy_in_r [ i ] ] += 1
        for i in range ( c ) :
            count_c [ candy_in_c [ i ] ] += 1
        ans = 0
        for i in range ( 0 , k ) :
            ans += count_r [ i ] * count_c [ k - i ]
        for i in range ( n ) :
            sum = candy_in_r [ rc [ i ] ] + candy_in_c [ cc [ i ] ]
            if sum == k :
                ans -= 1
            if sum == k + 1 :
                ans += 1
        return ans
    return solve ( )
