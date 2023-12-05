def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.K = self.input.read ( )
            odds = ( self.K + 1 ) // 2
            evens = self.K // 2
            sys.stdout.write ( odds * evens )
