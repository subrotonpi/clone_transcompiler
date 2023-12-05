def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import sin , cos , cos , pi
    with open ( '/proc/' , 'r' ) as sc :
        q = int ( sc.read ( ) )
        a , b = sc.read ( )
        for i in range ( q ) :
            tmpa , tmpb = randint ( 1 , a ) , randint ( 1 , b )
            if tmpa > tmpb :
                a , b = tmpb , tmpa
            else :
                a , b = tmpa , tmpb
        ans = 0
        ans += ( a - 1 ) * 2
        count = 0
        score = a * b
        l = 1
        r = 1000000000
        while r > l + 1 :
            m = ( l + r ) / 2
            if int ( m ) * int ( m ) < score :
                l = m
            else :
                r = m - 1
        if l != r and int ( l + 1 ) * int ( l + 1 ) < score :
            l += 1
        if l > a and l < b :
            ans += ( l - a ) * 2
        if int ( l ) * int ( l + 1 ) < score and l + 1 != b :
            ans += 1
        print ( ans )
