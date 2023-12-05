def import _set , _defaultdict
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        sc = _defaultdict ( set )
        n = sc.count ( )
        d = { }
        for i in range ( 2 , n + 1 ) :
            b = sc.__next__ ( )
            set = d.get ( b , None )
            if set is None :
                set = set ( )
                d [ b ] = set
            set.add ( i )
        sc.close ( )
        ans = [ ]
        print ( get_val ( 1 , ans , d ) )
    def getval ( i , ans , d ) :
        if ans [ i ] != 0 :
            return ans [ i ]
        set = d [ i ]
        if set is None :
            ans [ i ] = 1
            return ans [ i ]
        min = max = int ( i )
        for j in set :
            val = getval ( j , ans , d )
            min = min ( min , val )
            max = max ( max , val )
        ans.append ( min + max + 1 )
        return ans [ i ]
