def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = _main.raw_input ( )
        N = int ( sc )
        self.dp = set ( )
        A = 0
        count = 0
        for i in range ( N ) :
            B = int ( sc )
            self.dp.add ( B )
            if A == len ( self.dp ) :
                count += 1
            A = len ( self.dp )
        print ( count )
