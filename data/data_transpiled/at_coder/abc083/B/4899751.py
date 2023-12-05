def main ( ) :
    import math
    from math import pow
    from math import log
    from math import log
    from math import log
    from math import log
    from math import factorial
    n = int ( math.factorial ( n ) )
    a = int ( math.factorial ( a ) )
    b = int ( math.factorial ( b ) )
    sum = 0
    for i in range ( 1 , n + 1 ) :
        sum_of_digit = get_sum_of_each_digit ( i )
        if a <= sum_of_digit <= b :
            sum += i
    print ( sum )
    def get_sum_of_each_digit ( num ) :
        num = str ( num )
        sum = 0
        d = int ( pow ( 10 , num - 1 ) )
        for i in range ( len ( num ) ) :
            sum += num / d
            num %= d
            d /= 10
        return sum
    log ( "SumOfEachDigit (%d)" % ( n + 1 ) )
