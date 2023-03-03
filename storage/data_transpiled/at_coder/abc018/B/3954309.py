def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        ar = s.split ( '' )
        n = sc.__next__ ( )
        l = [ sc.choice ( [ '' ] ) for i in range ( n ) ]
        r = [ sc.choice ( [ '' ] ) for i in range ( n ) ]
        for i in range ( n ) :
            temp = ar
            ar = [ ]
            for j in range ( l [ i ] - 1 , r [ i ] ) :
                ar.append ( ar [ j ] )
            ar.reverse ( )
            for j in range ( l [ i ] - 1 , r [ i ] ) :
                ar [ j ] = ar [ j - l [ i ] + 1 ]
        print ( ''.join ( ar ) )
