def import import sys , string , traceback ; exit ( 0 ) :
    import sys , string , string , traceback ;
    from string import join , string , join
    from sys import version_info
    from itertools import izip , repeat
    sc = Scanner ( string , repeat = repeat )
    s = sc.next ( )
    for i in range ( len ( s ) / 2 ) :
        if s [ i ] != s [ - 1 - i ] :
            print ( 'NO' )
            exit ( 0 )
    print ( 'YES' )
