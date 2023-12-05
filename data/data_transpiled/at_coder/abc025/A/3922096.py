def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = sc.next ( )
        N = sc.__next__ ( )
        A = [ ]
        Ans = [ ]
        A = S.split ( '' )
        for i in A :
            for j in A :
                Ans.append ( i + j )
        print ( Ans [ N - 1 ] )
