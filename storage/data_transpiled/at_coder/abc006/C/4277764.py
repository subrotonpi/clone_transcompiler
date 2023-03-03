def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    N = int ( sys.stdin.read ( ) )
    M = int ( sys.stdin.read ( ) )
    if M < N * 2 or N * 4 < M :
        print ( '-1 -1 -1' )
        return
    o = r = a = 0
    for i in range ( N , - 1 , - 1 ) :
        a = i
        for j in [ 0 , 1 ] :
            r = j
            o = N - a - r
            if M == a * 4 + r * 3 + o * 2 :
                print ( o , r , a )
                return
    print ( '-1 -1 -1' )
