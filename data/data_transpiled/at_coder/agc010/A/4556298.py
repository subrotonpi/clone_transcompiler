def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    n = sc.next ( )
    oddCount = 0
    for i in range ( n ) :
        a = sc.next ( )
        if a % 2 == 1 :
            oddCount += 1
    if oddCount % 2 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
