def import import sys
class Main ( object ) :
    def main ( sc ) :
        n = sc.randint ( 1 , 10000 )
        limit = sc.randint ( 1 , 10000 )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.randint ( 1 , 10000 ) )
        ok = False
        ans = [ ]
        for i in range ( n - 1 ) :
            if a [ i ] + a [ i + 1 ] >= limit :
                ans.append ( n - 1 )
                ok = True
                break
        if not ok :
            print ( "Impossible" )
            return
        p = 1
        for i in range ( 0 , n ) :
            ans [ i ] = p
            p += 1
        for i in range ( n - 2 , n ) :
            ans [ i ] = p
            p += 1
        print ( "Possible" )
        for i in range ( n - 1 ) :
            print ( ans [ i ] )
