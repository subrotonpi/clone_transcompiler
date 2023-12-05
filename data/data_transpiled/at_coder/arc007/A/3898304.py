def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getcwd
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.environ import environ
    sc = getenv ( 'SC' )
    a = sc.next ( )
    mo = sc.next ( )
    s = ""
    for i in mo :
        if ( i + "" ) == a :
            pass
        else :
            s = s + "%s" % i
    pl ( s )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = list ( self.f.readline ( ) )
                except ValueError :
                    raise OSError ( "readline not supported" )
            return self.tokens [ 0 ]
        def randint ( self ) :
            return int ( self.tokens [ 0 ] )
        def long ( self ) :
            return long ( self.tokens [ 0 ] )
        def uniform ( self ) :
            return float ( self.tokens [ 0 ] )
        def readline ( self ) :
            try :
                return self.readline ( )
            except IOError :
                raise OSError ( "readline not supported" )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
