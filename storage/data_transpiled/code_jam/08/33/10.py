def _import ( ) :
    import os
    import sys
    import os
    import sys
    import itertools
    import collections
    import os
    import subprocess
    import subprocess
    class Summator :
        def __init__ ( self ) :
            self.N = self.N
            self.a = [ ]
        def __init__ ( self ) :
            self.N = self.N
            self.a = [ ]
        def __init__ ( self ) :
            self.a.append ( [ ] )
        def __init__ ( self , n ) :
            self.a = [ ]
            for i in range ( len ( self.a ) ) :
                self.a [ i ] = self.a [ i ]
        def __init__ ( self , n ) :
            self.a.append ( self.a [ n - 1 ] )
        def __init__ ( self , pos ) :
            self.a [ pos ] = self.a [ pos ]
        def __init__ ( self , pos ) :
            self.a [ pos ] = self.a [ pos ]
        def find_sum ( self , l , r ) :
            if l > 1 :
                return ( self.find_sum ( 1 , r ) - self.find_sum ( 1 , l - 1 ) ) % self.TaskC2.MOD
            if r > 0 :
                return ( self.find_sum ( 1 , prev ( r ) ) + self.a [ r ] ) % self.TaskC2.MOD
            else :
                return 0
        def modify ( self , p , v ) :
            x = self.p
            while x <= self.N :
                self.a [ x ] = ( self.a [ x ] + v ) % self.TaskC2.MOD
                x = next ( self.a [ x ] )
    class TaskC2 :
        def __init__ ( self ) :
            self.TEST_NAME = "C-large"
            self.INPUT_FILE = self.TEST_NAME + ".in"
            self.OUTPUT_FILE = self.TEST_NAME + ".out"
            self.MOD = 1000000007
        def __init__ ( self , testCaseID ) :
            self.a = [ ]
            self.testCaseID = testCaseID
            self.a = [ ]
            self.a = [ ]
    return TaskC2
    