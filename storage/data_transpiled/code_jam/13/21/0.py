def _import ( ) : return open ( "/dev/null" , "w" )
import os
import subprocess
import subprocess
import tempfile
import time
import subprocess
import subprocess
import subprocess
import tempfile
class A :
    TASK_LETTER = "A"
    def __init__ ( self , task_size ) :
        self.task_size = task_size
        self.sample = self.sample
        self.small_attempt0 = self.large
        self.n = self.n
        self.a = [ self.sample ]
        self.run ( )
        for case in self.testcases :
            self.write ( "Case #%d: %d" % ( case , self.task_size ) )
    def solve ( self ) :
        self.a = [ ]
        self.my_size = [ ]
        self.my_size.append ( 0 )
        self.my_size.append ( self.me )
        ans = self.n
        if self.me > 1 :
            for d in range ( 1 , self.n + 1 ) :
                size = self.my_size [ d - 1 ]
                self.my_size.append ( self.my_size [ d - 1 ] )
                while size <= self.a [ d - 1 ] :
                    size += size - 1
                    self.my_size [ d ] += 1
                size += self.my_size [ d - 1 ]
                self.my_size.append ( size )
                if ans > self.my_size [ d ] + self.n - d :
                    ans = self.my_size [ d ] + self.n - d
        return "%d" % ans
    class InputReader ( subprocess.AutoCloseInput ) :
        def __init__ ( self , filename ) :
            self.stdin = open ( filename , "r" )
            self.stdout = open ( filename , "r" )
            self.stdout.write ( "\n" )
        def readline ( self ) :
            while not self.stdin.readline ( ) :
                self.stdin.readline ( )
            return self.stdout.readline ( )
        def close ( self ) :
            self.stdout.close ( )
    return open ( "/dev/null" , "w" )
