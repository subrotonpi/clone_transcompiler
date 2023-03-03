def _pow ( b , n , mod ) :
    from math import pow
    from itertools import chain
    if not n :
        return 1
    if n % 2 == 0 :
        t = pow ( b , n // 2 , mod )
        return t ** 2 % mod
    return b * pow ( b , n - 1 , mod ) % mod
