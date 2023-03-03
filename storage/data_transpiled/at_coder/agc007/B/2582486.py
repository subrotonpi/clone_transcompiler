def import import sys
class Main ( object ) :
    def main ( sc ) :
        n = sc.randint ( 1 , 10000 )
        a = [ ]
        b = [ ]
        p = [ ]
        for i in range ( n ) :
            p.append ( i + 1 )
            a.append ( i * n + 1 )
        b.append ( 1 )
        for i in range ( n - 2 , - 1 , - 1 ) :
            b [ i ] = b [ i + 1 ] + n + p [ i ] - p [ i + 1 ]
        print ( " ".join ( a ).rjust ( 3 ) )
        print ( " ".join ( b ).rjust ( 3 ) )
