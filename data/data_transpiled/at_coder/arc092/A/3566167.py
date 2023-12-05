def import _main
class Main ( object ) :
    def __init__ ( self , x , y , n ) :
        for i in range ( n - 1 ) :
            for j in range ( n - 1 , i , - 1 ) :
                if x [ j - 1 ] > x [ j ] :
                    t = x [ j - 1 ]
                    x [ j - 1 ] = x [ j ]
                    x [ j ] = t
                    t = y [ j - 1 ]
                    y [ j - 1 ] = y [ j ]
                    y [ j ] = t
    def main ( ) :
        sc = _main ( )
        n = sc.count ( )
        a = [ ]
        b = [ ]
        c = [ ]
        d = [ ]
        for i in range ( n ) :
            a.append ( sc.randint ( 0 , n ) )
            b.append ( sc.randint ( 0 , n ) )
        for i in range ( n ) :
            c.append ( sc.randint ( 0 , n ) )
            d.append ( sc.randint ( 0 , n ) )
        sortpoint ( a , b , n )
        sortpoint ( c , d , n )
        ans = 0
        for i in range ( n ) :
            j = 0
            ymax = - 1
            index = - 1
            while j < n and a [ j ] < c [ i ] :
                if a [ j ] >= 0 and b [ j ] < d [ i ] :
                    if b [ j ] >= ymax :
                        ymax = b [ j ]
                        index = j
                j += 1
            if index >= 0 :
                ans += 1
                a [ index ] = - 1
        print ( ans )
