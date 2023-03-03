def main ( ) :
    import sys
    def solve ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            n = f.read ( )
        ans = '1'
        for i in range ( n - 1 ) :
            ans += '0'
        ans += '7'
        print ( ans )
    return solve
