def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) :
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import tempfile
    from time import time
    from itertools import izip
    from itertools import repeat
    if len ( sys.argv ) > 63 :
        raise AssertionError
    min = 0
    mask = 0
    for i in range ( len ( sys.argv ) ) :
        if sys.argv [ i ] == '0' :
            pass
        elif sys.argv [ i ] == '?' :
            mask |= 1 << ( len ( sys.argv ) - i - 1 )
        elif sys.argv [ i ] == '1' :
            min |= 1 << ( len ( sys.argv ) - i - 1 )
        else :
            raise AssertionError
    have = False
    for cmask in mask :
        if issquare ( min | cmask ) :
            if have :
                raise AssertionError
            _import ( )
            sys.stdout.write ( str ( min | cmask ) )
            have = True
        if cmask == 0 :
            break
    if not have :
        raise AssertionError
    def _import ( n ) :
        test = round ( sqrt ( n ) )
        while test * test > n :
            pass
        while test * test < n :
            pass
        return test * test == n
    def _import ( ) :
        tests = randint ( 1 , 10 )
        for test in range ( 1 , tests + 1 ) :
            _import sys
            sys.stdout.write ( "Case #%d: " % test )
            _import ( )
            sys.stdout.write ( "\n" )
    sys.stdout = _import ( )
    sys.stdout = _import ( )
