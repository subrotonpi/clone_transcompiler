def main ( ) :
    import sys
    with open ( 'A.txt' , 'r' ) as f :
        cases = f.readlines ( )
        f.seek ( 0 )
        for case_num in range ( 1 , cases + 1 ) :
            line = f.readline ( ).split ( '/' )
            p = int ( line [ 0 ] )
            q = int ( line [ 1 ] )
            gcd = gcd ( p , q )
            p /= gcd
            q /= gcd
            print ( 'Case #%d: ' % case_num , end = ' ' )
            if not is_power_of_two ( q ) :
                print ( 'impossible' )
                continue
            possible = False
            pow = 2
            for gens in range ( 1 , 40 ) :
                if pow * p >= q :
                    print ( gens )
                    possible = True
                    break
                pow *= 2
            if not possible :
                print ( 'impossible' )
    def is_power_of_two ( q ) :
        if q % 2 == 1 :
            return ( q == 1 )
        return is_power_of_two ( q // 2 )
    def gcd ( a , b ) :
        if a == 0 or b == 0 :
            return a + b
        return gcd ( b , a % b )
    return gcd ( a , a )
