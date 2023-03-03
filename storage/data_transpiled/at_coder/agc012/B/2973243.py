def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        al = [ [ ] for i in range ( n ) ]
        for i in range ( m ) :
            ma = sc.readline ( ).strip ( ) - 1
            mb = sc.readline ( ).strip ( ) - 1
            al [ ma ].append ( mb )
            al [ mb ].append ( ma )
        q = sc.readline ( ).strip ( )
        p = [ [ sc.readline ( ).strip ( ) - 1 , sc.readline ( ).strip ( ) ] for i in range ( q ) ]
        dp = [ [ - 1 ] * 11 for i in range ( n ) ]
        for i in range ( q ) :
            paint ( p [ i ] [ 0 ] , p [ i ] [ 1 ] , q - i - 1 )
        for i in range ( q ) :
            if dp [ i ] [ 0 ] == - 1 :
                print ( '0' )
            else :
                print ( p [ dp [ i ] [ 0 ] ] [ 2 ] )
    Note :./ Main._ uses _ unsafe.Note : Recompile.with - Xlint : classmethod ( details.Detail )
    def paint ( self , v , d , t ) :
        if self.dp [ v ] [ d ] != - 1 : return
        self.dp [ v ] [ d ] = t
        if not d : return
        for i in range ( len ( al [ v ] ) ) :
            paint ( al [ v ] [ i ] , d - 1 , t )
