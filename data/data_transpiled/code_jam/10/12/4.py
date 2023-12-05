def _import ( ) :
    import os
    import sys
    import os
    import os
    import subprocess
    import subprocess
    import time
    class Main ( object ) :
        _ReadFromFile = os.environ.get ( 'ONLINE_PYGE' ) is None
        _WriteToFile = True
        _TASK_ID = 'bl'
        _IN_FILE = '%s.in' % _TASK_ID
        _OUT_FILE = '%s.out' % _TASK_ID
        def read ( self ) :
            return int ( self.__next__ ( ) )
        def __next__ ( self ) :
            return float ( self.__next__ ( ) )
        def __next__ ( self ) :
            while not self.__next__ ( ) :
                self.__next__ ( )
            return self.__next__ ( )
        def core ( self ) :
            ntest = self.__next__ ( )
            for test in range ( ntest ) :
                delete_cost = self.__next__ ( )
                insert_cost = self.__next__ ( )
                distance = self.__next__ ( )
                n = self.__next__ ( )
                a = [ self.__next__ ( ) for _ in range ( n ) ]
                max_value = 256
                dp = [ [ ] for _ in range ( n + 1 ) ]
                for is in dp :
                    [ is ] = int ( dp [ last ] )
                dp [ 0 ] [ max_value ] = 0
                for i in range ( n ) :
                    for last in range ( 0 , max_value ) :
                        if dp [ i ] [ last ] != int ( dp [ i ] [ last ] ) :
                            update ( i + 1 , last , dp [ i ] [ last ] + delete_cost )
                            for next_last in range ( max_value ) :
                                if last == max_value :
                                    next_cost = dp [ i ] [ last ] + abs ( next_last - a [ i ] )
                                    update ( i + 1 , next_last , next_cost )
                                else :
                                    k = abs ( next_last - last )
                                    added = 0
                                    if k > 0 and not distance :
                                        continue
                                    if k > 0 :
                                        added = ( k - 1 ) / distance
                                    next_cost = dp [ i ] [ last ] + added * insert_cost + abs ( next_last - a [ i ] )
                                    update