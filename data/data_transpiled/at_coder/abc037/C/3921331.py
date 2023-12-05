def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sin
    from math import log
    from math import log
    from math import log
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = [ sin ( i ) for i in range ( a ) ]
    ans = 0
    for i in range ( a ) :
        for i in range ( a - b + 1 ) :
            for j in range ( i , i + b ) :
                ans += c [ j ]
    print ( ans )
