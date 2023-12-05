def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join , dirname , join
    from os import path
    from os.path import join , dirname , dirname , join
    N = int ( join ( dirname ( dirname ( __file__ ) ) , '..' ) )
    if N / 100 == 1 :
        a = N - 100
        sum = 900
        if a / 10 == 1 :
            a = a - 10
            sum += 90
            if a / 1 == 1 :
                sum += 9
            elif a / 9 == 1 :
                sum += 1
        elif a / 10 == 9 :
            a = a - 90
            sum += 10
            if a / 1 == 1 :
                sum += 9
            elif a / 9 == 1 :
                sum += 1
    if N / 100 == 9 :
        a = N - 900
        sum += 100
        if a / 10 == 1 :
            a = a - 10
            sum += 90
            if a / 1 == 1 :
                sum += 9
            elif a / 9 == 1 :
                sum += 1
        elif a / 10 == 9 :
            a = a - 90
            sum += 10
            if a / 1 == 1 :
                sum += 9
            elif a / 9 == 1 :
                sum += 1
    print ( sum )
