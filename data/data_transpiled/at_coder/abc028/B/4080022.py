def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        arr = sc.next ( ).split ( )
        counts = [ 0 ] * 6
        for c in arr :
            counts [ c - 'A' ] += 1
        s = [ ]
        for i in counts :
            if i != 0 :
                s.append ( " ".join ( [ str ( i ) for i in range ( len ( s ) ) ] ) )
        print ( s )
