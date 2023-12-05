def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    bucket = [ 0 ] * 15
    for i in range ( 3 ) :
        bucket [ sc.next ( ) ] += 1
    for i in bucket :
        if i % 2 == 1 :
            print ( i )
