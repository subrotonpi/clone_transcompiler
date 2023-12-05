def main ( ) :
    import sys
    for n in range ( sys.argv [ 1 ] ) :
        ans = sys.maxint
        for i in range ( n ) :
            x = sys.stdin.read ( )
            cnt = 0
            while x % 2 == 0 :
                x /= 2
                cnt += 1
            ans = min ( ans , cnt )
        print ( ans )
