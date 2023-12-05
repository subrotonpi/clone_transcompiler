def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    num = [ sc.next ( ) for i in range ( 3 ) ]
    cnt5 = 0
    cnt7 = 0
    for i in range ( 3 ) :
        if i == 5 :
            cnt5 += 1
        elif i == 7 :
            cnt7 += 1
    if cnt5 == 2 and cnt7 == 1 :
        print ( "YES" )
    else :
        print ( "NO" )
