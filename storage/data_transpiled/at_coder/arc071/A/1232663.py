def order ( a ) :
    from math import ceil
    def order ( a ) :
        o = 0
        d = 1
        while d <= a :
            o += 1
            d *= 10
        return o
    def ABCNumber ( a ) :
        num = - 1
        abc = 'abcdefghijklmnopqrstuvwxyz'
        for n in range ( 26 ) :
            if a == abc [ n ] :
                num = n
        return num
    def main ( ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        S = [ sc.readline ( ) for i in range ( N ) ]
        xmin = [ 50 for n in range ( 26 ) ]
        for i in range ( N ) :
            x = [ ]
            for a in S [ i ] :
                x [ ABCNumber ( a ) ] += 1
            for n in range ( 26 ) :
                xmin [ n ] = min ( xmin [ n ] , x [ n ] )
        abc = 'abcdefghijklmnopqrstuvwxyz'
        s = [ ]
        for n in range ( 26 ) :
            for cnt in range ( xmin [ n ] ) :
                s.append ( abc [ n ] )
        print ( ''.join ( s ) )
        sc.close ( )
    return main
