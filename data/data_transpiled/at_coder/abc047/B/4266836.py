def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def main ( self ) :
        w , h , n = self.sc.split ( )
        sq = [ [ False ] * ( h * w ) for x , y , a in self.sc.split ( ) ]
        for x , y , a in self.sc.split ( ) :
            if a == 1 :
                for i in range ( h ) :
                    for k in range ( x ) :
                        sq [ i ] [ k ] = True
            elif a == 2 :
                for i in range ( h ) :
                    for k in range ( x , w ) :
                        sq [ i ] [ k ] = True
            elif a == 3 :
                for i in range ( y ) :
                    for k in range ( w ) :
                        sq [ i ] [ k ] = True
            elif a == 4 :
                for i in range ( y ) :
                    for k in range ( w ) :
                        sq [ i ] [ k ] = True
        ans = 0
        for i in range ( h ) :
            for j in range ( w ) :
                if not sq [ i ] [ j ] :
                    ans += 1
        print ( ans )
return Main
