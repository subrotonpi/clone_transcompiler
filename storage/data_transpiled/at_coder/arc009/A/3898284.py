def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getcwd
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.environ import environ
    from os.path import join
    from os.path import expanduser
    from os.environ import environ
    from os.path import join
    from os import environ
    from os import getcwd
    from os.path import join
    class Main ( object ) :
        def __init__ ( self ) :
            sc = environ.get ( 'SC' , '' )
            N = sc.__next__ ( )
            sum = 0
            for i in range ( N ) :
                sum += sc.__next__ ( ) * sc.__next__ ( )
            self.pl ( ( sum * 21 / 20 ) )
    class SC ( object ) :
        def __init__ ( self , environ = environ ) :
            self.environ = environ
        def readline ( self ) :
            if not environ or not environ [ 'PATH' ].startswith ( '/' ) :
                try :
                    environ [ 'PATH' ] = join ( environ [ 'PATH' ] , '' )
                except TypeError :
                    raise OSError ( )
            return environ [ 'PATH' ].split ( '/' ) [ - 1 ]
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return long ( next ( self ) )
        def nextDouble _ ( self ) :
            return float ( next ( self ) )
        def readline ( self ) :
            try :
                return open ( join ( self.environ [ 'PATH' ] , 'r' ) ).readline ( )
            except IOError :
                raise OSError ( )
    pl = Main ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.__next__ ( )
    pl.next ( )
    pl.next ( )
    