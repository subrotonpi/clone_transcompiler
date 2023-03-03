def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import sys
    import time
    class Main ( object ) :
        _ReadFromFile = os.environ.get ( 'ONLINE_PYGE' ) is None
        _WriteToFile = True
        _TASK_ID = 'cl'
        _IN_FILE = '%s.in' % _TASK_ID
        _OUT_FILE = '%s.out' % _TASK_ID
        def read ( self ) :
            return int ( self.__next__ )
        def __next__ ( self ) :
            return float ( self.__next__ )
        def __next__ ( self ) :
            while not self.__next__ ( ) :
                self.__next__ = self.__next__
            return __next__
        def __next__ ( self ) :
            return int ( self.__next__ )
        def __next__ ( self ) :
            return float ( self.__next__ )
        def core ( self ) :
            max_value = 1000001
            max_win = [ int ( self.__next__ ) , 0 ]
            for i in range ( 2 , len ( max_win ) ) :
                last = max_win [ i - 1 ]
                while is_win ( i , last + 1 ) :
                    last += 1
                max_win.append ( last )
            min_win = [ 0 , 2 ]
            for i in range ( 2 , len ( min_win ) ) :
                last = min_win [ i - 1 ]
                while last < len ( min_win ) and not is_win ( last , i ) :
                    last += 1
                min_win.append ( last )
            ntest = self.__next__ ( )
            for test in range ( ntest ) :
                amin = self.__next__ ( )
                amax = self.__next__ ( )
                bmin = self.__next__ ( )
                bmax = self.__next__ ( )
                res = 0
                for i in range ( amin , amax + 1 ) :
                    res += overlap ( 1 , max_win [ i ] , bmin , bmax ) + overlap ( min_win [ i ] , bmax , bmin , bmax )
                write_case ( test )
                self.__next__ ( )
    def debug ( self , * args ) :
        print ( "".join (