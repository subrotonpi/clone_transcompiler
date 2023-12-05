def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = int ( sc.next ( ) )
        a = [ ]
        aeve = [ ]
        for i in range ( n ) :
            a.append ( int ( sc.next ( ) ) )
            if i % 2 == 0 :
                aeve.append ( a [ i ] )
        a.sort ( )
        d = { }
        for i in range ( n ) :
            d [ a [ i ] ] = i % 2
        cnt = 0
        for i in aeve :
            cnt += d [ i ]
        print ( cnt )
