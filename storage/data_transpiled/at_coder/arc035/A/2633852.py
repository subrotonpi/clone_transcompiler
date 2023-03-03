def _import ( ) :
    from os import popen
    from string import ascii_letters
    import string
    r = popen ( [ '/usr/bin/cat' , 'cat' , '/opt' ] )
    s = r.read ( )
    n = len ( s )
    for i in range ( n ) :
        if s [ i ] != '*' and s [ n - 1 - i ] != '*' and s [ i ] != s [ n - 1 - i ] :
            print ( 'NO' )
            sys.exit ( 0 )
    print ( 'YES' )
