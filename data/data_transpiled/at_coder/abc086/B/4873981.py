def main ( ) :
    import math
    from math import pow
    from math import sin , cos , exp
    a = int ( math ( sin ( a ) ) )
    b = int ( math ( sin ( b ) ) )
    b_len = len ( str ( b ) )
    c = a * int ( pow ( 10 , b_len ) ) + b
    ans = False
    for i in range ( 1 , 10 ) :
        if i ** 2 > c :
            break
        if i ** 2 == c :
            ans = True
            break
    if ans :
        print ( "Yes" )
    else :
        print ( "No" )
