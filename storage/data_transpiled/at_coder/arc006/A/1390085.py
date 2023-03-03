def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    passing_n = [ sc.next ( ) for i in range ( 6 ) ]
    B = sc.next ( )
    count1 = count2 = 0
    for i in range ( 6 ) :
        buy_n = sc.next ( )
        if buy_n in passing_n :
            count1 += 1
        if B == buy_n :
            count2 += 1
    ans = 0
    if count1 == 3 :
        ans = 5
    if count1 == 4 :
        ans = 4
    if count1 == 5 :
        ans = 3
    if count1 == 5 and count2 == 1 :
        ans = 2
    if count1 == 6 :
        ans = 1
    print ( ans )
