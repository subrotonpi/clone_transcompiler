def main ( ) :
    import math
    from math import floor
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import floor
    N = sqrt ( N )
    M = int ( floor ( sqrt ( N ) ) )
    if N == 1 :
        print ( "Deficient" )
        return
    ans = 1l
    for i in range ( 2l , M + 1 ) :
        if N % i == 0 :
            if i != N / i :
                ans += N / i
            ans += i
    if ans == N :
        print ( "Perfect" )
    elif ans < N :
        print ( "Deficient" )
    elif ans > N :
        print ( "Abundant" )
