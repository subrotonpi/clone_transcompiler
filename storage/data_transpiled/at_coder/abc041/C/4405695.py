def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        dict = defaultdict ( list )
        for i in range ( N ) :
            dict [ sc.next ( ) ].append ( i + 1 )
        for i in dict.values ( ) :
            print ( i )
