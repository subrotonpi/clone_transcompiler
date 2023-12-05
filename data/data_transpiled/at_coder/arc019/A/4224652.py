def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        s = [ ]
        for c in s :
            if c == 'O' or c == 'D' :
                s.append ( 0 )
            elif c == 'I' :
                s.append ( 1 )
            elif c == 'Z' :
                s.append ( 2 )
            elif c == 'S' :
                s.append ( 5 )
            elif c == 'B' :
                s.append ( 8 )
            else :
                s.append ( c )
        print ( s )
