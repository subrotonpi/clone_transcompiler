def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        w = sc.read ( )
        h = sc.read ( )
        n = sc.read ( )
        fields = [ [ False for v in range ( h ) ] for v in range ( n ) ]
        for x , y , a in itertools.izip ( range ( w ) , range ( h ) ) :
            if a == 1 :
                for i in range ( x ) :
                    for j in range ( h ) :
                        fields [ j ] [ i ] = True
            elif a == 2 :
                for i in range ( x ) :
                    for j in range ( h ) :
                        fields [ j ] [ i ] = True
            elif a == 3 :
                for i in range ( w ) :
                    for j in range ( y ) :
                        fields [ j ] [ i ] = True
            elif a == 4 :
                for i in range ( w ) :
                    for j in range ( y ) :
                        fields [ j ] [ i ] = True
        cnt = 0
        for i in range ( w ) :
            for j in range ( h ) :
                if not fields [ j ] [ i ] :
                    cnt += 1
        print ( cnt )
