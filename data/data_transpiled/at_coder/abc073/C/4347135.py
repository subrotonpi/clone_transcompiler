def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        seen = set ( )
        for i in range ( n ) :
            temp = _main ( )
            if temp in seen :
                seen.remove ( temp )
            else :
                seen.add ( temp )
        print ( len ( seen ) )
