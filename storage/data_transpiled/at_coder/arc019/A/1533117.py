def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
    def read ( self ) :
        return sys.stdin.read ( )
    map = { 'O' : 0 , 'D' : 0 , 'I' : 1 , 'Z' : 2 , 'S' : 5 , 'B' : 8 }
    data = read ( self )
    for c in data :
        sys.stdout.write ( str ( map [ c ] ) if c in map else c )
    sys.stdout.write ( '\n' )
