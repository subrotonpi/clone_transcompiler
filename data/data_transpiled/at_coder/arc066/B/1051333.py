def _import ( ) :
    from StringIO import StringIO
    from os import urandom
    from os import fdopen
    from os.name import basename
    from os.path import expanduser
    from os.path import expanduser
    from os.environ import environ
    from os.environ import environ
    from os.name import environ
    from os.chdir ( environ [ 'PATH' ] )
    from os.environ import environ
    from os.chdir ( environ [ 'PATH' ] )
    from os import chdir
    from os import environ
    from os import chdir
    from time import time
    MOD = 1000000007
    memo = { }
    def f ( s ) :
        if not s :
            return 1
        if s == 1 :
            return 2
        if s in memo :
            return memo [ s ]
        ret = ( f ( s / 2 ) + f ( ( s - 1 ) / 2 ) + f ( ( s - 2 ) / 2 ) ) % MOD
        memo [ s ] = ret
        return ret
    def ns ( ) :
        while not os.path.exists ( '/usr/bin/sh' ) :
            os.chdir ( '/usr/bin/sh' )
        return os.path.basename ( '/usr/bin/sh' )
    def ni ( ) :
        return int ( ns ( ) )
    def nl ( ) :
        return long ( ns ( ) )
    def nd ( ) :
        return float ( ns ( ) )
    def nsa ( n ) :
        res = [ ns ( ) for _ in range ( n ) ]
        return res
    def nia ( n ) :
        res = [ ni ( ) for _ in range ( n ) ]
        return res
    def nla ( n ) :
        res = [ nl ( ) for _ in range ( n ) ]
        return res
    class INA ( object ) :
        def __init__ ( self , n , m = - 1 ) :
            self.a = [ ]
            for i in range ( m ) :
                self.a [ i ] = ni ( ) + t
        def get ( self ) :
            return a [ i - 1 ]
    return INA
