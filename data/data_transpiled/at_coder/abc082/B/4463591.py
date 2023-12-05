def _import ( ) :
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            sc = chain ( )
            s , t = sc.next ( ).split ( ' ' )
            s.sort ( )
            t.sort ( )
            six.reverse ( t )
            compared = len ( str ( s ) )
            print ( 'Yes' if compared < 0 else 'No' )
    class ArrayUtils ( object ) :
        def reverse ( self ) :
            for i in range ( len ( self ) // 2 ) :
                tmp = self [ i ]
                self [ i ] = self [ - i - 1 ]
                self [ - i - 1 ] = tmp
