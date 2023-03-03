def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = [ ]
        o = sc.readline ( )
        e = sc.readline ( )
        for i in o :
            s.append ( i )
            if i < len ( e ) :
                s.append ( e [ i ] )
        print ( ' '.join ( s ) )
