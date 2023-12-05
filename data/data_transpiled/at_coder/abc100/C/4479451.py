def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    n = sc.next ( )
    ans = 0
    for i in range ( n ) :
        m = sc.next ( )
        for _ in range ( n ) :
            if m % 2 == 0 :
                m /= 2
                ans += 1
            else :
                break
    print ( ans )
