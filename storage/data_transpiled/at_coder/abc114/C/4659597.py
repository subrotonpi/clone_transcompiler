def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    digits = 0
    MSB = N
    while MSB > 0 :
        digits += 1
        MSB //= 10
    total = 0
    while digits >= 3 :
        total += sgs ( digits , N , 0 )
        digits -= 1
    print ( total )
    def sgs ( digit , N , value ) :
        if digit == 0 :
            if is_valid ( value , N ) :
                return 1
            return 0
        n1 = sgs ( digit - 1 , N , value * 10 + 3 )
        n2 = sgs ( digit - 1 , N , value * 10 + 5 )
        n3 = sgs ( digit - 1 , N , value * 10 + 7 )
        return n1 + n2 + n3
    def isValid ( value , N ) :
        if value <= N :
            three_count = 0
            five_count = 0
            seven_count = 0
            while value > 0 :
                if value % 10 == 3 :
                    three_count += 1
                elif value % 10 == 5 :
                    five_count += 1
                elif value % 10 == 7 :
                    seven_count += 1
                else :
                    break
                value /= 10
            if three_count and five_count and seven_count :
                return True
        return False
    return sgs ( digit , N , value )
