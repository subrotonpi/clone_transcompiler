def _import ( ) : return int ( next ( sys.stdin ) )
class B :
    def __init__ ( self ) :
        self.size = 35
    def to_arr ( k ) :
        ans = [ ]
        for i in range ( len ( ans ) ) :
            ans.append ( k % 2 )
            k /= 2
        return ans
    max = [ ]
    dict = { }
    def eval ( a , b , k , pos ) :
        state = " ".join ( a ) + " " + " ".join ( b ) + " " + " ".join ( k ) + " " + str ( pos )
        if pos < 0 :
            return 1
        if state in dict :
            return dict [ state ]
        ans = 0
        for val1 in range ( 0 , a [ pos ] ) :
            for val2 in range ( 0 , b [ pos ] ) :
                if ( val1 & val2 ) <= k [ pos ] :
                    ans += eval ( val1 == a [ pos ] , val2 == b [ pos ] , ( val1 & val2 ) == k [ pos ] , pos - 1 )
        dict [ state ] = ans
        return ans
    def solve ( ) :
        [ a , b , k ] = to_arr ( randint ( 1 , max ) - 1 )
        out = open ( "B.in" , "w" )
        t = randint ( 1 , max )
        for i in range ( 1 , t + 1 ) :
            sys.stderr.write ( "Case #%d: " % i )
            solve ( )
        out.close ( )
    def main ( ) :
        with open ( "B.in" , "r" ) as infile :
            with open ( "B.out" , "w" ) as outfile :
                for i in range ( 0 , t ) :
                    sys.stderr.write ( "Case #%d: " % i )
                    solve ( )
    main ( )
