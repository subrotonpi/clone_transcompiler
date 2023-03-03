def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    n = sc.__next__ ( )
    kusi = [ sc.__next__ ( ) for _ in range ( 2 * n ) ]
    sc.close ( )
    kusi.sort ( )
    ans = 0
    for i in range ( 0 , 2 * n , 2 ) :
        ans += kusi [ i ]
    print ( ans )
