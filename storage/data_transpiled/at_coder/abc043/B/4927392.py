def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __str__ ( self ) :
        s = sys.stdin.read ( )
        s = s.chars.split ( ' ' )
        for c in s :
            if c in ( '0' , '1' ) :
                s.append ( ord ( c ) )
            elif c == 'B' :
                if len ( s ) > 0 :
                    s.pop ( )
            else :
                pass
        print ( ' '.join ( s ) )
