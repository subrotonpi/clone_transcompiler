def main ( arg = None ) :
    from sys import stdin
    from os.path import expanduser
    from os import environ
    sc = stdin
    N = int ( sys.stdin.readline ( ) )
    sc.readline ( )
    data = sc.readline ( )
    sc.close ( )
    S = data.split ( )
    n = [ ]
    count = 0
    for i in range ( N ) :
        n.append ( int ( S [ i ] ) )
    while 1 :
        for i in range ( len ( n ) ) :
            if n [ i ] % 2 == 0 :
                n [ i ] = n [ i ] // 2
            else :
                print ( count )
                sys.exit ( )
        count += 1
