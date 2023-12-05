def _import ( ) :
    from StringIO import StringIO
    from random import randint
    from time import sleep
    from sys import maxsize
    from os.name import curdir
    from os.path import join
    from os.environ import environ
    from os.environ import environ
    from os.chdir ( curdir )
    class A :
        def __init__ ( self ) :
            environ = environ
            os.chdir ( curdir )
            self.environ = environ
        def solve ( self ) :
            n = randint ( 1 , 10000 )
            r = randint ( 1 , 10000 )
            p = randint ( 1 , 10000 )
            s = randint ( 1 , 10000 )
            sr = 'R'
            sp = 'P'
            ss = 'S'
            for i in range ( n ) :
                nn = 1 << ( n - i - 1 )
                if r > nn or p > nn or s > nn :
                    self.printcase ( )
                    self.stdout.write ( 'IMPOSSIBLE' )
                    return
                t = nn - p
                p = nn - s
                s = nn - r
                r = t
                st = ss + sr if sr > 0 else sr + ss
                ss = ss + sp if sp > 0 else ss
                sp = sp + sr if sp > 0 else sr + ss
                sr = st
            self.printcase ( )
            self.stdout.write ( sr if r > 0 else p , sp , ss )
        def printlncase ( self ) :
            self.stdout.write ( 'Case #%d: ' % self.test )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return long ( next ( self ) )
        def nextDouble ( self ) :
            return float ( next ( self ) )
        def __next__ ( self ) :
            while self.__next__ ( ) or not self.__next__ ( ) :
                self.__next__ ( )
            return __next__
    A = A ( )
    A.__next__ = __next__
    print ( A ( ) )
