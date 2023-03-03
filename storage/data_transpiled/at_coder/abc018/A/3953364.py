def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        A = [ ]
        B = [ ]
        for i in range ( 3 ) :
            a = sc.read ( )
            A.append ( a )
            B.append ( a )
        A.sort ( key = lambda a : a.index ( b ) )
        for i in A :
            print ( A.index ( B [ i ] ) + 1 )
