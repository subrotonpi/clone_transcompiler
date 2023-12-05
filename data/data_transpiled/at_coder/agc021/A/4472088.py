def main ( ) :
    import sys
    from time import sleep
    from string import printable
    N = int ( sys.stdin.read ( ) )
    sys.stdout.write ( "{}\n".format ( N ) )
    s = printable [ N ]
    l = len ( s )
    cnt = 0
    max = 0
    for c in s :
        if c == '9' :
            cnt += 1
        max += c - '0'
    if cnt == l :
        print ( l * 9 )
        sys.exit ( )
    k = ( l - 1 ) * 9 + s [ 0 ] - '0' - 1
    max = max ( max , k )
    print ( max )
