def main ( ) :
    import sys
    from math import sin , cos
    input = sys.stdin
    A = input.read ( )
    ans = 0
    for i in range ( 1 , A + 1 , 2 ) :
        count = 0
        j = 1
        while count < 10 and j <= i :
            if i % j == 0 :
                count += 1
            j += 1
        if count == 8 :
            ans += 1
    sys.stdout.write ( ans )
