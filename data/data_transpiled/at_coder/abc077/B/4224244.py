def main ( srgs ) :
    import math
    from os.path import join
    from os import path
    from math import sqrt
    from os.path import join
    a = join ( path , 'a' )
    ans = 1
    for i in range ( a , 0 , - 1 ) :
        if sqrt ( i ) == int ( sqrt ( i ) ) :
            print ( i )
            break
    return ans
