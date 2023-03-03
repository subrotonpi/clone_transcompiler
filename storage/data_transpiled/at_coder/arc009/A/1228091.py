def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        s = _sys.stdin
        self.stdout = s
        self.stderr = s
    def main ( self ) :
        res = 0
        for c in range ( self.stdout.tell ( ) , self.stdout.tell ( ) , self.stderr.tell ( ) ) :
            res += self.stdout.tell ( ) * self.stdout.tell ( )
        print ( int ( res * 1.05 ) )
