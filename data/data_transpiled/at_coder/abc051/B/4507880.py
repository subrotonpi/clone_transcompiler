def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    sc = randtest.Scanner ( )
    K = int ( sc.next ( ) )
    S = int ( sc.next ( ) )
    ans = 0
    for x in range ( 0 , K ) :
        for y in range ( 0 , K ) :
            z = S - ( x + y )
            if z >= 0 and z <= K :
                ans += 1
    print ( ans )
    sc.close ( )
