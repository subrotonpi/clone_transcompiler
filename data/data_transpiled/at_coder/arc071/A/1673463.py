def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        class Str :
            chars = [ 0 ] * 26
        def __call__ ( self ) :
            n = sc.__next__ ( )
            words = [ Str ( ) for i in range ( n ) ]
            for s in sc.split ( ) :
                words [ s ] = Str ( )
                for c in s :
                    words [ s ].chars [ c - 'a' ] += 1
    fin = Str ( )
    for i in range ( 26 ) :
        min_c = sys.maxint
        for j in range ( n ) :
            min_c = min ( min_c , words [ j ].chars [ i ] )
        fin.chars [ i ] = min_c
    lines = [ ]
    for i in range ( 26 ) :
        for j in fin.chars [ i ] :
            lines.append ( chr ( i + 'a' ) )
    print ( ''.join ( lines ) )
