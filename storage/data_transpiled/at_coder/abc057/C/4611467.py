def _import ( ) :
    from math import sqrt
    from math import factorial
    from math import factorial
    from math import log
    from math import log
    from math import log
    from math import factorial
    from math import log
    from math import log
    N = factorial ( n )
    ans = sum ( 1 for n in range ( 1 , n + 1 ) if n % i == 0 )
    root_N = int ( sqrt ( N ) )
    for i in range ( 1 , root_N + 1 ) :
        muti = N / i
        if N % i == 0 :
            ans = min ( ans , digit ( muti ) )
    print ( ans )
    def digit ( n ) :
        return len ( str ( n ) )
    return digit ( ans )
