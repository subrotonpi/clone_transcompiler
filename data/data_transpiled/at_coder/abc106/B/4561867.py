def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import urandom
    n = urandom ( 1024 )
    ans = 0
    for i in range ( 99 , n + 1 , 2 ) :
        yakusu = 0
        for j in range ( 1 , n + 1 ) :
            if i % j == 0 :
                yakusu += 1
        if yakusu == 8 :
            ans += 1
    print ( ans )
