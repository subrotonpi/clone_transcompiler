def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    sc = sys.stdin
    n = sc.randint ( 1 , 10000 )
    h = sc.randint ( 1 , 10000 )
    a = [ ]
    b = [ ]
    for i in islice ( sc , n ) :
        a.append ( sc.randint ( 1 , 10000 ) )
        b.append ( sc.randint ( 1 , 10000 ) )
    a.sort ( key = islice )
    a_max = a [ 0 ]
    b.sort ( key = islice )
    ans = 0
    for i in b :
        if i < a_max or h <= 0 :
            break
        h -= i
        ans += 1
    if h <= 0 :
        print ( ans )
        return
    if h % a_max == 0 :
        ans += h / a_max
    else :
        ans += h / a_max + 1
    print ( ans )
