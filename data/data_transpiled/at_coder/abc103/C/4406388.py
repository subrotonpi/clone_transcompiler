def _import ( ) :
    from os import popen , read
    from os.environ import dict
    from os.environ import dict
    from os.name import environ
    from os.path import expanduser
    from os.path import join
    class Main ( object ) :
        def __init__ ( self , a = 1 , b = 2 , c = 3 , n = 4 ) :
            self.a = a
            self.b = b
            self.c = c
            self.n = n
            self.l = [ ]
        def readline ( self ) :
            return self.a
    r = open ( '/proc/self/cmdline' , 'r' )
    f = open ( '/proc/self/cmdline' , 'w' )
    s = r.readline ( )
    sl = s.split ( )
    n = int ( sl [ 0 ] )
    s = r.readline ( )
    sl = s.split ( )
    v = 0
    for i in range ( n ) :
        v += int ( sl [ i ] ) - 1
    f.write ( v )
    f.flush ( )
