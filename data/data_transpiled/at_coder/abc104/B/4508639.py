def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.original = sys.stdin.read ( )
    S = sys.stdin.read ( )
    flag = True
    if S [ 0 ] != 'A' :
        flag = False
    C_index = S.index ( 'C' )
    if S.index ( 'C' ) > len ( S ) - 2 or S.index ( 'C' ) < 2 :
        flag = False
    for i in range ( 1 , len ( S ) ) :
        if i != C_index and S [ i ].isupper ( ) :
            flag = False
    if flag :
        ans = 'AC'
    else :
        ans = 'WA'
    sys.stdout.write ( ans )
