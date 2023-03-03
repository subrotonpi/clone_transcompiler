def main ( ) :
    import sys
    from os import urandom
    n = urandom ( 256 )
    count = 0
    for i in range ( 1 , n + 1 ) :
        if i % 2 == 0 :
            continue
        yakusuu = 0
        for j in range ( 1 , i + 1 ) :
            if i % j == 0 :
                yakusuu += 1
        if yakusuu == 8 :
            count += 1
    print ( count )
