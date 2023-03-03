def main ( ) :
    import sys
    from string import atoi
    sc = sys.stdin
    s = sc.read ( )
    k = atoi ( sc.read ( ) )
    for i in range ( k ) :
        if s [ i ] >= '2' :
            print ( s [ i ] )
            return
    print ( 1 )
