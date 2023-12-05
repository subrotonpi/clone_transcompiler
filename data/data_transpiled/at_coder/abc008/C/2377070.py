def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    N = int ( sys.argv [ 1 ] )
    C = [ sin ( i ) for i in range ( N ) ]
    chdir ( '..' )
    ans = 0
    for i in range ( N ) :
        cnt = 0
        for j in range ( N ) :
            if C [ i ] % C [ j ] == 0 :
                if i != j :
                    cnt += 1
        if cnt % 2 == 0 :
            ans += float ( cnt + 2 ) / float ( 2 * cnt + 2 )
        else :
            ans += 0.5
    print ( ans )
