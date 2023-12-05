def import import sys , string , ** kwargs ) :
    import sys
    import string
    import sys
    if sys.version_info >= ( 2 , 6 ) :
        sc = string.ascii_lowercase
        n = int ( sc )
        d = 0
        for i in range ( n ) :
            d += sc.choice ( string.ascii_lowercase ) % 2
        print ( 'YES' if d % 2 == 0 else 'NO' )
