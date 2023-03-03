def main ( ) :
    import sys
    import random
    import sys
    import os
    import sys
    import random
    import sys
    import math
    import random
    import random
    import string
    input = sys.stdin
    output = open ( 'c.txt' , 'w' )
    T = random.randint ( 1 , 5 )
    for t in range ( T ) :
        output.write ( 'Case #%d: \n' % ( t + 1 ) )
        r , n , m , k = random.randint ( 1 , m ) , random.randint ( 1 , k ) , random.randint ( 1 , k )
        for rr in range ( r ) :
            twopow , threepow , fivepow = 0 , 0 , 0
            for i in range ( k ) :
                p = random.randint ( 1 , n )
                fives = 0
                while p % 5 == 0 and p > 0 :
                    p /= 5
                    fives += 1
                fivepow = max ( fives , fivepow )
                twos = 0
                while p % 2 == 0 and p > 0 :
                    p /= 2
                    twos += 1
                twopow = max ( twos , twopow )
                threes = 0
                while p % 3 == 0 and p > 0 :
                    p /= 3
                    threes += 1
                threepow = max ( threes , threepow )
            used = 0
            while fivepow > 0 :
                used += 1
                fivepow -= 1
                output.write ( 5 )
            while threepow > 0 :
                used += 1
                threepow -= 1
                output.write ( 3 )
            while twopow > n - used :
                twopow -= 2
                used += 1
                output.write ( 4 )
            while used < n :
                used += 1
                output.write ( 2 )
            output.write ( '\n' )
    output.close ( )
