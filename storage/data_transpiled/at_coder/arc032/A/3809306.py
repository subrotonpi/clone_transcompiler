def main ( args ) :
    import math
    from os import path
    from os import path
    from math import sqrt
    from os.path import join
    N = int ( path.join ( path.dirname ( __file__ ) , '..' ) )
    sum = 0
    for i in range ( 1 , N + 1 ) :
        sum += i
    flag = True
    if N == 1 :
        flag = False
    elif N == 2 :
        flag = True
    elif N > 2 :
        for i in range ( 2 , math.sqrt ( sum ) + 1 ) :
            if sum % i == 0 :
                flag = False
                break
    if flag :
        print ( 'WANWAN' )
    else :
        print ( 'BOWWOW' )
