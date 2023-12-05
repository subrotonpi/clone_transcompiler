def main ( args ) :
    import sys
    with open ( 'test.txt' , 'r' ) as f :
        T = int ( f.read ( ) )
        for ca , n , pd , pg in itertools.izip ( T , range ( T ) ) :
            good = False
            bad = False
            if 100 / gcd ( 100 , pd ) <= n :
                good = True
            if pg == 100 and pd != 100 :
                bad = True
            if pg == 0 and pd != 0 :
                bad = True
            print ( 'Case #{}: {}'.format ( ca + 1 , 'Possible' if good and not bad else 'Broken' ) )
    def gcd ( a , b ) :
        if b == 0 :
            return a
        return gcd ( b , a % b )
    return gcd ( a , gcd )
