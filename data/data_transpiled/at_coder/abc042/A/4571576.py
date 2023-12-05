def main ( ) :
    import sys
    from collections import defaultdict
    with open ( sys.argv [ 1 ] , 'r' ) as f :
        seen = defaultdict ( int )
        for ix in range ( 3 ) :
            value = f.read ( )
            seen [ value ] = seen.get ( value , 0 ) + 1
        result = 5 in seen and 7 in seen and seen [ 5 ] == 2 and seen [ 7 ] == 1
        print ( 'YES' if result else 'NO' )
