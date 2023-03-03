def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import sin , cos , cos , log
    with open ( "/proc/test.txt" , "r" ) as sc :
        d = [ ]
        j = [ ]
        for i in range ( 7 ) :
            d.append ( sc.randint ( 0 , 7 ) )
        for i in range ( 7 ) :
            j.append ( sc.randint ( 0 , 7 ) )
        ans = 0
        for i in range ( 7 ) :
            max = max ( d [ i ] , j [ i ] )
            ans += max
        print ( ans )
