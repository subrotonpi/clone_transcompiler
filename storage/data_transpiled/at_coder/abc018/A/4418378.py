def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    n = [ ]
    cnt = 3
    for i in range ( 3 ) :
        n.append ( sc.next ( ) )
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            if n [ i ] > n [ j ] :
                cnt -= 1
        print ( cnt )
        cnt = 3
