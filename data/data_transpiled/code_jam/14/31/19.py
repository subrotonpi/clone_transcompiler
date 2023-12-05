def _import ( ) :
    import os
    import sys
    import os
    import sys
    import getopt
    cases = getopt.getopt ( 'A-small.out.txt' , '' )
    outfile = open ( 'A-small.out.txt' , 'w' )
    for o , a in getopt.getopt ( sys.argv [ 1 : ] , '' ) :
        input = a
        result = ''
        for c in range ( 1 , cases + 1 ) :
            input , index = getopt.getopt ( input , '' )
            res = test ( int ( input [ : index ] ) , int ( input [ 1 + index : ] ) )
            result = 'Case #%d: %s' % ( c , str ( res ) if res >= 0 else 'impossible' )
            outfile.write ( result )
            print ( result , file = outfile )
        outfile.close ( )
    def test ( num , denom ) :
        factor = gcd ( num , denom )
        num /= factor
        denom /= factor
        max = 0
        for test in denom :
            if test & 1 == 1 : return - 1
            max += 1
        min = 0
        for test in num :
            min += 1
        return max - min
    def gcd ( a , b ) :
        if not b : return a
        return gcd ( b , a % b )
    return test ( )
