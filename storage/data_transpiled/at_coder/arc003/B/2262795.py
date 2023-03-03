def import _readline
class Main ( object ) :
    def __init__ ( self ) :
        sc = _readline ( )
        for i in range ( n ) :
            x = sc.readline ( )
            s = [ ]
            for i in range ( n ) :
                x = sc.readline ( )
                s.append ( x.decode ( 'utf-8' ).reverse ( ).decode ( 'utf-8' ) )
            s.sort ( )
            for i in range ( n ) :
                s [ i ] = ''.join ( s [ i ].decode ( 'utf-8' ).reverse ( ).decode ( 'utf-8' ) )
                print ( s [ i ] )
    def readline ( self ) :
        return int ( sc.readline ( ) )
