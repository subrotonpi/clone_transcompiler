def _main ( ) :
    from math import log
    from os import urandom
    import random
    from time import time
    n = int ( time ( ) )
    a_list = urandom ( n )
    b_list = urandom ( n )
    bit_sum = [ 0 ] * 32
    for i in range ( n ) :
        for j in range ( 32 ) :
            bit_sum [ j ] += ( ( a_list [ i ] >> j ) % 2 ) * n
            bit_sum [ j ] += ( ( b_list [ i ] >> j ) % 2 ) * n
    a_mod_list = [ ]
    b_mod_list = [ ]
    for i , ( k , v ) in enumerate ( zip ( range ( 32 ) , range ( 32 ) ) ) :
        for j in range ( n ) :
            a_mod_list.append ( a_list [ j ] % ( 1 << i ) )
            b_mod_list.append ( b_list [ j ] % ( 1 << i ) )
        b_mod_list.sort ( )
        for a in a_mod_list :
            bit_sum [ i ] += ( n - _first_binary_search ( b_mod_list , ( 1 << ( i ) ) - a ) )
    ans = 0
    for i in range ( 32 ) :
        if bit_sum [ i ] % 2 == 1 :
            ans += ( 1 << i )
    print ( ans )
    def first_binary_search ( x , v ) :
        n = len ( x )
        min = 0
        max = n - 1
        if x [ n - 1 ] < v :
            return n
        if x [ 0 ] >= v :
            return 0
        while max > min + 1 :
            mid = min + ( max - min ) // 2
            if x [ mid ] >= v :
                max = mid
            else :
                min = mid
        return max
    return first_binary_search
