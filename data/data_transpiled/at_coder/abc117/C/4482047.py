def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        if N >= M :
            print ( 0 )
            return
        X = [ ]
        for i in range ( M ) :
            X.append ( sc.__next__ ( ) )
        X.sort ( )
        ranking = [ ]
        for i in range ( 1 , M ) :
            dif = X [ i ] - X [ i - 1 ]
            ranking.append ( ( i , dif ) )
        ranking.sort ( key = lambda x : y [ 1 ] - x [ 1 ] )
        while len ( ranking ) >= N :
            ranking.pop ( N - 1 )
        ranking.insert ( 0 , ( M , - 1 ) )
