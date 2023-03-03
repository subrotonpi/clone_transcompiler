def main ( ) :
    import sys
    import string
    n = len ( sys.stdin.readlines ( ) )
    red = blue = 0
    for i in range ( n ) :
        s = sys.stdin.readlines ( ) [ i ]
        for c in s :
            if c == 'R' :
                red += 1
            elif c == 'B' :
                blue += 1
    print ( 'DRAW' if red == blue else 'TAKAHASHI' if red > blue else 'AOKI' )
