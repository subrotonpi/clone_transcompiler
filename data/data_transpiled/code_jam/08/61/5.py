def main ( args ) :
    import sys
    class A ( object ) :
        def __call__ ( self , * args ) :
            cin = sys.stdin
            n = cin.count ( )
            for z in range ( n ) :
                m = cin.count ( )
                ms = [ ]
                me = [ ]
                bf = [ ]
                for i in range ( m ) :
                    ms.append ( cin.next ( ) )
                    me.append ( cin.next ( ) )
                    bf.append ( cin.next ( ) )
                    if not bf.get ( i ) :
                        cin.next ( )
    print ( "UNKNOWN" )
    as = sum ( [ a for a in me if a <= b ] )
    bs = sum ( [ a for a in me if a <= b ] )
    ae = sum ( [ a for a in me if a <= b ] )
    be = sum ( [ a for a in me if a <= b ] )
    none = True
    for i in range ( m ) :
        if bf.get ( i ) :
            as = min ( as , ms [ i ] )
            bs = max ( bs , ms [ i ] )
            ae = min ( ae , me [ i ] )
            be = max ( be , me [ i ] )
            none = False
    print ( "Case #%d:" % ( z + 1 ) )
    c = cin.count ( )
    cs = [ ]
    ce = [ ]
    MAIN :
    for i in range ( c ) :
        cs.append ( cin.next ( ) )
        ce.append ( cin.next ( ) )
        if as <= cs [ i ] <= bs and ae <= ce [ i ] <= be :
            print ( "BIRD" )
            continue
    for i in range ( m ) :
        if bf.get ( i ) :
            continue
        if as <= ms [ i ] <= ms [ i ] <= bs :
            if ce [ i ] <= me [ i ] <= ae :
                print ( "NOT BIRD" )
                continue
        if be < me [ i ] <= ce [ i ] :
            print ( "NOT BIRD" )
            continue
