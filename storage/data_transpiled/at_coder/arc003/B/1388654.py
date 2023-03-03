def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
    def run ( self ) :
        ans = [ ]
        for s in self.Scanner.input ( ) :
            s = s.decode ( 'utf-8' )
            ans.append ( s.reverse ( ).decode ( 'utf-8' ) )
        ans.sort ( )
        for s in ans :
            s = s.decode ( 'utf-8' )
            print ( s.reverse ( ).decode ( 'utf-8' ) )
