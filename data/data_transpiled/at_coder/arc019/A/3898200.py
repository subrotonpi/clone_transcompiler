def _import ( ) :
    from os import system , PIPE , PIPE
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.environ import environ
    sc = SC ( sys.stdin )
    s = sc.next ( )
    su = ''
    for i in s :
        if i == 'O' :
            su = su + '0'
        elif i == 'D' :
            su = su + '0'
        elif i == 'I' :
            su = su + '1'
        elif i == 'Z' :
            su = su + '2'
        elif i == 'S' :
            su = su + '5'
        elif i == 'B' :
            su = su + '8'
        else :
            su = su + '%s' % i
    pl ( su )
    class SC ( object ) :
        def readline ( self ) :
            return None
        def readline ( self ) :
            if not self.readline or not self.readline.strip ( ) :
                try :
                    self.readline ( )
                except IOError :
                    raise OSError ( )
            return self.readline ( )
        def readline ( self ) :
            try :
                return int ( readline ( self ) )
            except ValueError :
                raise OSError ( )
        def readline ( self ) :
            try :
                return self.readline ( )
            except IOError :
                raise OSError ( )
        def pl ( x ) :
            print ( x )
        def p ( x ) :
            print ( x , end = '' )
        def isPrime ( a ) :
            if a < 4 :
                if a == 2 or a == 3 :
                    return True
                else :
                    return False
            else :
                for i in range ( 2 , a + 1 ) :
                    if i % 2 == 0 :
                        return True
                    else :
                        return False
            return True
    pl ( )
