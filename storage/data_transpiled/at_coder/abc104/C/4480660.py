def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __call__ ( self ) :
        sc = sys.stdin
        ( D , G ) = sc.read ( )
        score = [ ]
        p = [ sc.randint ( 0 , D ) for i in range ( D ) ]
        c = [ sc.randint ( 0 , D ) for i in range ( D ) ]
        min_turns = sys.maxint
        for mask , bound in ( ( 1 , 1 ) , ( 1 , 1 ) ) :
            s = 0
            turns = 0
            ptn = get_patterns ( D , mask )
            for i in range ( D ) :
                if ptn [ i ] :
                    s += p [ i ] * score [ i ] + c [ i ]
                    turns += p [ i ]
            if s >= G :
                min_turns = min ( min_turns , turns )
                continue
            for i in range ( ( D - 1 , - 1 , - 1 ) ) :
                if ptn [ i ] :
                    continue
                for i in range ( p [ i ] - 1 ) :
                    s += score [ i ]
                    turns += 1
                    if s >= G :
                        min_turns = min ( min_turns , turns )
                        break
        print ( min_turns )
        sc.close ( )
    def get_patterns ( d , mask ) :
        patterns = [ ]
        for i in range ( d ) :
            if mask & ( 1 << i ) :
                patterns.append ( True )
        return patterns
