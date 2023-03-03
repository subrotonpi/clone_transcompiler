def main ( ) :
    import sys
    for n , m in enumerate ( sys.stdin ) :
        ans = min ( n , m // 2 )
        m -= ans * 2
        if m > 0 :
            ans += m // 4
        print ( ans )
