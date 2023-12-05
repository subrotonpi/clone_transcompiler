def import _main
class Main ( object ) :
    class A :
        def __init__ ( self ) :
            self.N = None
            self.C = None
            self.indexes = { }
    MOD = 1000000007
    def add ( a , b ) :
        return ( a + b ) % MOD
    def main ( ) :
        with open ( "/proc/cpuinfo" , "r" ) as infile :
            N = int ( infile.readline ( ) )
            self.C = [ ]
            c_max = - 1
            for i in range ( N ) :
                self.C.append ( int ( infile.readline ( ) ) )
                c_max = max ( c_max , self.C [ i ] )
            infile.close ( )
            self.memo = [ 0 ] * ( c_max + 1 )
            self.memo [ C [ 0 ] ] = 1
            for i in range ( 1 , N ) :
                if self.C [ i - 1 ] != C [ i ] :
                    self.memo [ C [ i ] ] = self.add ( self.memo [ C [ i ] ] , self.memo [ C [ i - 1 ] ] )
            self.result = self.memo [ C [ - 1 ] ]
    def main ( ) :
        ins = Main ( )
        print ( ins.result )
