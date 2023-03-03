def _ ( ) : return ''
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.atcoder = ''
    def __init__ ( self ) :
        sc = sys.stdin
        S = sc.read ( )
        T = sc.read ( )
        self.win = True
        for s , t in zip ( S , T ) :
            if s != t and not ( s == '@' and self.contains ( t ) or t == '@' and self.contains ( s ) ) :
                self.win = False
                break
        print ( 'You can win' if self.win else 'You will lose' )
    def contains ( c ) :
        for c in atcoder :
            if c in c : return True
        return False
