def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import count
    N = len ( sys.stdin.readline ( ) )
    a = next ( sys.stdin.readline ( ) )
    b = next ( sys.stdin.readline ( ) )
    K = len ( sys.stdin.readline ( ) )
    map = [ a , b ]
    for i in range ( 2 , K + 2 ) :
        map.append ( next ( map ) )
    count = sum ( map )
    print ( count == K + 2 )
