def _import ( ) : return sys.stdin.read ( )
def _import ( s , f , x ) :
    for i in range ( len ( f ) ) :
        if not f [ i ] :
            continue
        if i + x < len ( f ) :
            return i + x
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def readline ( self ) :
            while not stream.readline ( ) or not stream.readline ( ) :
                stream.readline ( )
        def readline ( self ) :
            return int ( self.stream.readline ( ) )
    class TaskD ( object ) :
        def solve ( self , test_number , f , g ) :
            n = self.test_number
            k = self.test_number
            a = [ ]
            for i in range ( 1 , n + 1 ) :
                a.append ( f [ i ] )
            pref = [ [ ] for _ in range ( n + 2 ) ]
            suff = [ [ ] for _ in range ( n + 2 ) ]
            pref.append ( [ True ] * ( n + 1 ) )
            for i in range ( n + 1 , n - 1 ) :
                add ( pref [ i ] , pref [ i - 1 ] , a [ i ] )
            suff.append ( [ True ] * ( n + 1 ) )
            for i in range ( n , 1 , - 1 ) :
                add ( suff [ i ] , suff [ i + 1 ] , a [ i ] )
            ans = n
            s = [ ]
            outer :
            for i in range ( 1 , n + 1 ) :
                for j in range ( k ) :
                    s.append ( s [ j ] + ( suff [ i + 1 ] [ j ] , 1 ) )
                for x in range ( k ) :
                    if not pref [ i - 1 ] [ x ] :
                        continue
                    l = k - a [ i ] - x
                    r = k - x - 1
                    l = _import ( l , k - 1 )
                    r = _import ( r , k - 1 )
                    l = _import ( l , k )
                    r = _import ( r , k )