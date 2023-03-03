def main ( ) :
    import sys
    for sc in sys.stdin :
        s = sc.read ( ).decode ( )
        ans = 0
        for c in s :
            if c == '1' :
                ans += 1
        print ( ans )
