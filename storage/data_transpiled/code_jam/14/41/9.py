def test_solve ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    t = randint ( 1 , 5 )
    for current_test in range ( t ) :
        n , x = randint ( 1 , 5 ) , randint ( 1 , 5 )
        a = [ randint ( 1 , 5 ) for _ in range ( n ) ]
        print ( 'Case #%d: %s' % ( 1 + current_test , solve ( n , x , a ) ) )
    def solve ( n , x , a ) :
        a.sort ( )
        ans = 0
        was = [ False ] * n
        for i in range ( n - 1 , - 1 , - 1 ) :
            if was [ i ] :
                continue
            was [ i ] = True
            found = - 1
            for j in range ( n - 1 , - 1 , - 1 ) :
                if was [ j ] :
                    continue
                if a [ i ] + a [ j ] <= x :
                    found = j
                    break
            if found >= 0 :
                was [ found ] = True
            ans += 1
        return ans
    def main ( ) :
        filename = 'a.in'
        input = sys.stdin
        output = sys.stdout
        if os.path.exists ( filename ) and os.access ( filename , os.R_OK ) :
            input = open ( filename , 'r' )
            output = sys.stdout
        input = input.readlines ( )
        output = output.writelines
        solve ( )
        output.close ( )
    def readline ( ) :
        while not tokens or not tokens :
            line = input.readline ( )
            if not line :
                return False
            tokens = line.split ( )
        return True
    def advance ( ) :
        return next ( tokens )
    def verify ( ) :
        return verify ( )
    return verify ( )
