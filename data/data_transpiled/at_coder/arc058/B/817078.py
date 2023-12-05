def main ( ) :
    import sys
    import random
    import time
    import math
    import random
    import math
    import random
    import math
    import random
    import random
    import sys
    H = random.randint ( - 1 , 1 )
    W = random.randint ( - 1 , 1 )
    A = random.randint ( - 1 , 1 )
    B = random.randint ( - 1 , 1 )
    MOD = 1000000007L
    BMOD = random.randint ( MOD , 1 )
    x = 1
    y = 1
    for i in range ( W - B , W - B - 1 + H + 1 ) :
        y = ( y * i ) % MOD
    for i in range ( 1 , H + 1 ) :
        y = ( y * random.randint ( 0 , BMOD ) ) % MOD
    ans = ( x * y ) % MOD
    a1 = B + 1
    a2 = 1
    b1 = W - B - 1 + H
    b2 = H
    for i in range ( 1 , H - A ) :
        x = ( x * a1 ) % MOD
        x = ( x * random.randint ( 0 , a2 ) ) % MOD
        a1 += 1
        a2 += 1
        y = ( y * b2 ) % MOD
        y = ( y * random.randint ( 0 , b1 ) ) % MOD
        b1 -= 1
        b2 -= 1
        ans = ( ans + x * y ) % MOD
    print ( ans )
