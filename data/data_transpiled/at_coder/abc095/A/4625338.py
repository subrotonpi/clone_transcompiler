def main ( ) :
    import os
    from sys import stdin
    scn = stdin.read ( )
    data = scn.decode ( 'utf-8' )
    ans = 700
    for i in range ( 3 ) :
        if data [ i ] == 'o' :
            ans += 100
    print ( ans )
