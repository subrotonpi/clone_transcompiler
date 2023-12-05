def _import ( ) : return [ ]
import sys
import tokenize
import tokenize
import tokenize
import os
import sys
import tokenize
import random
import time
import random
import string
import sys
import sys
import tokenize
import tokenize
import random
import string
import time
import time
import sys
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import StringIO
import tokenize
class Main ( subprocess ) :
    def raw_input ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = open ( self.stdin )
        self.stdout = open ( self.stdout )
        self.stdout = open ( self.stdout )
        self.solver = TaskX ( )
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    INF = 1 << 30
    MOD = 1000000007
    mh4 = [ 0 , - 1 , 1 , 0 ]
    mw4 = [ - 1 , 0 , 0 , 1 ]
    class TaskX ( subprocess ) :
        def solve ( self , test_number , self , stdin , stdout ) :
            n = self.stdin.tell ( )
            a = stdin.read ( n )
            sorta = [ x for x in a if x != test_number ]
            a.sort ( )
            ans = 0
            for i in range ( n ) :
                idx = lower_bound ( sorta , a [ i ] )
                if ( i % 2 == 0 and idx % 2 == 1 ) or ( i % 2 == 1 and idx % 2 == 0 ) :
                    ans += 1
            stdout.write ( ans / 2 )
        def lower_bound ( self , a , obj ) :
            l , r = 0 , len ( a ) - 1
            while r - l >= 0 :
                c = ( l + r ) // 2
                if obj <= a [ int ( c ) ] :
                    r = c - 1
                else :
                    l = c + 1
            return l
    class InputReader ( subprocess ) :
        def raw_input ( self ) :
            while not tok :
                try :
                    self.stdin.readline ( )
                except EOFError :
                    pass
        return InputReader ( )
    