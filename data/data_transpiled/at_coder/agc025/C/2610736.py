def _import ( ) :
    from math import sin , cos , abs
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    li = [ ]
    for i in range ( N ) :
        l , r = [ int ( i ) for i in urandom ( randint ( 1 , 10000 ) ) ]
        li.append ( ( l , r ) )
    ri = li [ : ]
    li.sort ( lambda i1 , i2 : cmp ( i2.l , i1.l ) )
    ri.sort ( lambda i1 , i2 : cmp ( i1.r , i2.r ) )
    ans = solve ( li , ri )
    for i in range ( N ) :
        ri [ i ].used = False
    ans = max ( ans , solve ( ri , li ) )
    print ( ans )
    def solve ( f , s ) :
        fi = si = t = p = 0
        sum = 0
        while True :
            while f [ fi ].used :
                fi += 1
            f [ fi ].used = True
            if p < f [ fi ].l :
                sum += f [ fi ].l - p
                p = f [ fi ].l
            elif f [ fi ].r < p :
                sum += p - f [ fi ].r
                p = f [ fi ].r
            t += 1
            if t == len ( f ) :
                break
            while s [ si ].used :
                si += 1
            s [ si ].used = True
            if p < s [ si ].l :
                sum += s [ si ].l - p
                p = s [ si ].l
            elif s [ si ].r < p :
                sum += p - s [ si ].r
                p = s [ si ].r
            t += 1
            if t == len ( s ) :
                break
            sum += abs ( p )
            return sum
    return solve ( f , s )
