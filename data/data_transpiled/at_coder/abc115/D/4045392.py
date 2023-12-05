def main ( ) :
    import math
    from math import pow
    from math import pow
    from math import sqrt
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( math.log ( x ) )
    x = int ( math.log ( x ) )
    print ( count_p ( n , x ) )
    def count_p ( n , x ) :
        p_count = 0
        if x <= n :
            return 0
        if n == 0 :
            return 1
        half = long ( pow ( 2 , n + 1 ) ) - 2
        if x > half :
            p_count += long ( pow ( 2 , n ) ) - 1
            if x != half :
                p_count += 1
                n_x = x - half - 1
                p_count += count_p ( n - 1 , n_x )
        else :
            return count_p ( n - 1 , x - 1 )
        return p_count
    log ( count_p , x )
