def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    a = sin ( 0 )
    ans = 1
    for i in range ( 0 , a + 1 ) :
        for j in range ( 2 , sqrt ( i ) + 1 ) :
            for k in range ( j , i + 1 ) :
                if k == i :
                    ans = i
    print ( ans )
