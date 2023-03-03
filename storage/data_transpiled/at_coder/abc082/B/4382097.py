def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.split ( ' ' )
        t = sc.split ( ' ' )
        s.sort ( )
        t.sort ( )
        reverse ( t )
        ss = _main ( s )
        tt = _main ( t )
        if ss < tt :
            print ( 'Yes' )
        else :
            print ( 'No' )
    def reverse ( self ) :
        for i in range ( len ( self ) // 2 ) :
            tmp = self [ i ]
            self [ i ] = self [ - 1 - i ]
            self [ - 1 - i ] = tmp
        return self
