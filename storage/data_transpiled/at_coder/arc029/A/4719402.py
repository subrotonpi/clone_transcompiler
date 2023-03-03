def __loast ( t , n , i , a , b ) :
    import sys
    if i == n :
        return max ( a , b )
    return min ( __loast ( t , n , i + 1 , a + t [ i ] , b ) , __loast ( t , n , i + 1 , a , b + t [ i ] ) )
