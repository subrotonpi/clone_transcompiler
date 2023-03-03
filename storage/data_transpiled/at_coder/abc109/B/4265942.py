def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        set = set ( )
        ar = [ ]
        for i in range ( n ) :
            ar.append ( sc.next ( ) )
            set.add ( ar )
        if len ( set ) < n :
            print ( "No" )
            return
        F = True
        for i in range ( n - 1 ) :
            if ar [ i ] [ - 1 ] != ar [ i + 1 ] [ 0 ] :
                F = False
                break
        print ( "Yes" if F else "No" )
