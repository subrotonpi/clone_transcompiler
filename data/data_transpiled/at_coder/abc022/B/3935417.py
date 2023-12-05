def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        A = [ sc.choice ( [ 'A' , 'B' , 'C' , 'D' ] ) for i in range ( N ) ]
        ans = 0
        for i in range ( N ) :
            set = A [ i ]
            for j in range ( i + 1 , N ) :
                if set == A [ j ] :
                    ans += 1
                    break
        print ( ans )
