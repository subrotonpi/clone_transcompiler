def import import sys
class Main ( object ) :
    def main ( sc ) :
        n = sc.randint ( 1 , 10000 )
        t = [ ]
        for i in range ( n ) :
            t.append ( sc.randint ( 1 , 10000 ) )
        ans = 201
        for b in range ( ( 1 << n ) ) :
            t1 = t2 = 0
            for p in range ( n ) :
                if ( ( b & ( 1 << p ) ) >> p ) == 1 :
                    t1 += t [ p ]
                else :
                    t2 += t [ p ]
            ans = min ( ans , max ( t1 , t2 ) )
        print ( ans )
