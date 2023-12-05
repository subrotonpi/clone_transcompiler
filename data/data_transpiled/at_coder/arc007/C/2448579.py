def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = sys.argv [ 0 ]
    def run ( self ) :
        sc = sys.stdin
        input = sc.read ( )
        n = len ( input )
        signal = [ ]
        for i in range ( n ) :
            if input [ i ] == 'o' :
                signal.append ( True )
            else :
                signal.append ( False )
        result = 99999
        for i in range ( ( 1 , n ) ) :
            now = [ False ] * n
            counter = 0
            for j in range ( n ) :
                if ( i >> j ) % 2 == 0 :
                    continue
                counter += 1
                for k in range ( n ) :
                    if not signal [ k ] :
                        continue
                    now [ ( j + k ) % n ] = True
            flag = True
            for j in range ( n ) :
                if not now [ j ] :
                    flag = False
            if flag :
                result = min ( result , counter )
        print ( result )
