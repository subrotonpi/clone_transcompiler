def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            sc = math.Scanner ( )
            l = sc.nextLong ( )
            n = sc.nextInt ( )
            x = [ sc.nextLong ( ) for i in range ( n ) ]
            x = [ ]
            for i in range ( n ) :
                x.append ( sc.nextLong ( ) )
            x = [ ]
            for i in range ( n ) :
                x.append ( sc.nextLong ( ) )
            x.append ( l - x [ n - 1 - i ] )
            res2 = max ( sol ( x , l ) , sol ( y , l ) )
            self.pl ( res2 )
        def sol ( x , l ) :
            n = len ( x )
            nega = 0
            res = 0
            for i in range ( n ) :
                if i == 0 :
                    res = x [ n - 1 ]
                    nega = l - x [ n - 1 ]
                    res = max ( res , res )
                else :
                    res = l * ( i + 1 )
                    if i % 2 == 0 :
                        nega += ( x [ n - 1 - i / 2 + 1 ] - x [ n - 1 - i / 2 + 1 - ( i / 2 + 1 ) ] ) * 2 - ( x [ n - 1 + 1 - i / 2 ] - x [ n - 1 + 1 - i / 2 - 1 ] )
                    else :
                        nega += ( x [ n - 1 - i / 2 ] - x [ n - 1 - i / 2 - ( i / 2 + 1 ) ] ) * 2
                    res -= nega
                    res = max ( res , res )
            return res
        def brute ( x , l ) :
            n = len ( x )
            dp = [ ]
            for i in range ( 0 , n ) :
                for j in range ( 0 , n ) :
                    if i == 0 and j == 0 :
                        continue
                    it1 = ( i - 1 <= 0 )
                    it2 = ( i - 1 <= 0 )
                    x.append ( sc.nextLong ( ) )
                dp.append ( ( it1 , it2 ) )
            return dp
    return Main
