def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    n = sc.next ( )
    a = sc.next ( )
    b = sc.next ( )
    cnt = { a : 1 , b : 1 }
    k = sc.next ( )
    ans = 'YES'
    for i in range ( k ) :
        p = sc.next ( )
        cnt [ p ] += 1
        if cnt [ p ] >= 2 :
            ans = 'NO'
    print ( ans )
