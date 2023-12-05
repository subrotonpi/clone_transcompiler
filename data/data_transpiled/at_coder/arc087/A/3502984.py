def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
    sc = sys.stdin
    N = sc.readline ( ).strip ( )
    A = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
    mp = { }
    for i in range ( N ) :
        if A [ i ] in mp :
            mp [ A [ i ] ] = mp [ A [ i ] ] + 1
        else :
            mp [ A [ i ] ] = 1
    ans = 0
    for k , val in mp.items ( ) :
        if k > val :
            ans += val
        elif k < val :
            ans += ( val - k )
    print ( ans )
