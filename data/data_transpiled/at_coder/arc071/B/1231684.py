def _import ( ) :
    from math import pow
    from numpy import log
    from math import sin , cos , pi
    MOD = 1000000007
    def sum ( x , n ) :
        s = 0
        for i in range ( n ) :
            s += i * x [ i ] % MOD
            s -= ( n - 1 - i ) * x [ i ] % MOD
            s = ( s + MOD ) % MOD
        return s
    def main ( ) :
        with open ( "/proc/" , "r" ) as f :
            n , m = map ( int , f.readlines ( ) )
            x = [ ]
            y = [ ]
            for i in range ( n ) :
                x.append ( f.read ( ) )
            for j in range ( m ) :
                y.append ( f.read ( ) )
            x.sort ( )
            y.sort ( )
            print ( sum ( x , n ) * sum ( y , m ) % MOD )
    return main
