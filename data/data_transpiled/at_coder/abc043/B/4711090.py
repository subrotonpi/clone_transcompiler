def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        s = [ ]
        for tmp in s :
            if tmp == '0' :
                s.append ( '0' )
            elif tmp == '1' :
                s.append ( '1' )
            elif tmp == 'B' :
                if not s [ - 1 ] :
                    s.pop ( )
        for item in s :
            sys.stdout.write ( item )
        sys.stdout.write ( '\n' )
