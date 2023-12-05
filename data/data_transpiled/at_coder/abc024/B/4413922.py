def main ( args ) :
    import sys
    from math import sin , cos
    from math import cos , pi
    sc = Scanner ( )
    n = sc.nextInt ( )
    t = sc.nextInt ( )
    lst = [ ]
    ans = 0
    for i in range ( n ) :
        p = sc.nextInt ( )
        lst.append ( p )
        if i > 0 :
            diff = lst [ i ] - lst [ i - 1 ]
            if diff >= t :
                ans += t
            else :
                ans += diff
    ans += t
    print ( ans )
