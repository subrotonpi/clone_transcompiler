def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = int ( sc.next ( ) )
    abc = [ 111 , 222 , 333 , 444 , 555 , 666 , 777 , 888 , 999 ]
    for i in abc :
        if n <= i :
            print ( i )
            return
