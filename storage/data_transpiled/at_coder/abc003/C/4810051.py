def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.K = 0
    def ratelist ( self ) :
        self.takahashirate = 0
    def main ( ) :
        sc = _main.raw_input ( )
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        for i in range ( self.N ) :
            self.ratelist.append ( sc.__next__ ( ) )
        self.ratelist.sort ( )
        sbratelist = self.ratelist [ self.N - K : ]
        for target in sbratelist :
            self.takahashirate = ( self.takahashirate + target ) / 2.0
        print ( self.takahashirate )
