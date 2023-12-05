def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import sin , cos , fabs
    from math import log
    from math import log
    from math import sin , cos , fabs
    from math import log
    from math import sin , cos , fabs
    from math import log
    from math import sin , cos , fabs
    from math import log
    N = randint ( 1 , 10 )
    ans = dfs ( N , 0 )
    out = log ( ans )
    def dfs ( N , org ) :
        if N < org :
            return 0
        ret = 0
        if have_753 ( org ) :
            ret += 1
        nums = [ 7 , 5 , 3 ]
        for num in nums :
            ret += dfs ( N , org * 10 + num )
        return ret
    def have_753 ( num ) :
        is_exists = [ ]
        while num > 0 :
            rest = int ( num % 10 )
            num = num // 10
            is_exists.append ( rest )
        return is_exists [ 3 ] & is_exists [ 5 ] & is_exists [ 7 ]
    return dfs ( N , 0 )
