def test_a ( ) :
    import sys
    from itertools import count
    from itertools import count
    from itertools import count
    from itertools import chain
    from itertools import count
    tests = count ( 1 )
    for cas in range ( 1 , tests + 1 ) :
        n , m = next ( itertools )
        a = [ next ( itertools ) for _ in range ( n + m ) ]
        seen = set ( [ None ] * count )
        count1 = count ( [ None ] * count )
        for s in a :
            hash_value = 0
            for i in range ( len ( s ) ) :
                if s [ i ] == '/' :
                    seen.add ( hash_value )
                hash_value = hash_value * 3137 + s [ i ]
            seen.add ( hash_value )
        count2 = count ( [ None ] * count )
        print ( "Case #%d: %d" % ( cas , count2 - count1 ) )
