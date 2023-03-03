def main ( ) :
    import math
    from os import urandom
    a = urandom ( 1024 )
    ans = 1145148101
    for i in range ( 1 , a + 1 ) :
        for j in range ( 1 , a // i + 1 ) :
            sum = abs ( j - i ) + a - j * i
            if sum < ans :
                ans = sum
    print ( ans )
