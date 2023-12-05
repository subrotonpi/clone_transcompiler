def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.j = self.sc.randint ( 0 , 1 )
            num = ( self.j - 1 ) % 9 + 1
            time = ( self.j + 8 ) / 9
            for i in range ( time ) :
                sys.stdout.write ( num )
            sys.stdout.write ( '\n' )
